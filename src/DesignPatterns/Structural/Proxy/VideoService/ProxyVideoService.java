package DesignPatterns.Structural.Proxy.VideoService;

public class ProxyVideoService implements VideService {
    private int cachedVideo = 0;
    private final RealVideService realVideService;

    public ProxyVideoService() {
        realVideService = new RealVideService();
    }

    @Override
    public int downloadVideo() {
        if (cachedVideo == 0) {
            System.out.println("Video is not found in cache.. Downloading from server..");
            cachedVideo = realVideService.downloadVideo();
        } else {
            System.out.println("Video found in cache..Returning it from cache..");
        }
        return cachedVideo;
    }

    @Override
    public void playVideo(int videoId) {
        System.out.println("ProxyService:: Playing video with id: " + videoId);
    }
}
