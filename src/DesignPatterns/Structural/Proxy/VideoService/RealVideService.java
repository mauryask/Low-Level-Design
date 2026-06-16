package DesignPatterns.Structural.Proxy.VideoService;

public class RealVideService implements VideService {
    @Override
    public int downloadVideo() {
        connectToServer();
        return (int) System.currentTimeMillis();
    }

    @Override
    public void playVideo(int videoId) {
        System.out.println("RealVideoService:: Playing video with id: " + videoId);
    }

    // Simulate network latency
    public void connectToServer() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
