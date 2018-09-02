package com.springexp.IosAppsSearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.Application;
import data.AppsResultList;
import data.SearchReq;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
public class ItunesApiController {

    private static final Logger LOG = LoggerFactory.getLogger(ItunesApiController.class);

    public ItunesApiController() {

    }

    @GetMapping("/search")
    public String getSearchValue(Model model) throws Exception {
        model.addAttribute("appSearchRequest", new SearchReq());
        return "input";
    }

    @PostMapping("/search")
    public String searchSubmit(@ModelAttribute SearchReq searchReq, Model model) throws Exception {
        model.addAttribute("appSearchRequest", new SearchReq());
        System.out.println(searchReq.getAppSearchName());
        String url = "https://itunes.apple.com/search?country=us&entity=software&term=" + searchReq.getAppSearchName().replaceAll(" ", "+");

        LOG.info("SEND GET REQUEST");
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet request = new HttpGet(url);
        HttpResponse response = httpClient.execute(request);

        LOG.info("PARSE RESPONSE FROM ITUNES API");
        String result = EntityUtils.toString(response.getEntity());
        ObjectMapper objectMapper = new ObjectMapper();
        AppsResultList apps = objectMapper.readValue( result, AppsResultList.class);

        System.out.println(apps.getResults().get(0).getArtistId());
        ArrayList<Application> appps = apps.getResults();
        model.addAttribute("apps", appps);
        return "index";
    }

}
