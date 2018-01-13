package com.butchjgo.linkservice.common.service;

import com.butchjgo.linkservice.common.domain.FileInfo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.LinkedList;

public class FshareFolder2Url implements Text2Url, Worker<String,FileInfo[]> {
    @Override
    public String[] getUrl(String text) {
        Document document = Jsoup.parse(text);

        LinkedList<String> strings = new LinkedList<>();

        final String cssSelector = "li";

        Elements elements = document.select(cssSelector);

        for (Element element : elements) {
            Element name = element.selectFirst("a.filename[data-type=file]");
            Element size = element.selectFirst("div.file_size[data-size]");
            if (name != null && size != null) {
                String fileId = name.attr("data-id");
                String fileName = name.text();
                String fileSize = size.text();
                strings.add(fileId);
            }
        }
        return strings.toArray(new String[strings.size()]);
    }

    @Override
    public FileInfo[] process(String s) {
        Document document = Jsoup.parse(s);

        LinkedList<FileInfo> infos = new LinkedList<>();

        final String cssSelector = "li";

        Elements elements = document.select(cssSelector);

        for (Element element : elements) {
            Element name = element.selectFirst("a.filename[data-type=file]");
            Element size = element.selectFirst("div.file_size[data-size]");
            if (name != null && size != null) {
                String fileUrl = name.attr("href");
                String fileName = name.text();
                String fileSize = size.text();
                FileInfo fileInfo = new FileInfo(fileUrl, fileName, fileSize);
                infos.addLast(fileInfo);
            }
        }
        return infos.toArray(new FileInfo[infos.size()]);
    }
}
