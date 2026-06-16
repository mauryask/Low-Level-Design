package DesignPatterns.Structural.Proxy.VideoService;

public class Main {
    public static void main(String[] args) {
        ProxyVideoService proxyVideoService = new ProxyVideoService();
        proxyVideoService.downloadVideo();
        proxyVideoService.downloadVideo();
    }
}
