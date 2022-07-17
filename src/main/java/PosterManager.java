public class PosterManager {
    private int count = 10;
    private PosterItem[] items = new PosterItem[0];

    public PosterManager() {

    }

    public PosterManager(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void addPoster(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] getItems() {
        return items;
    }

//    public PosterItem[] findAll(PosterItem[] items) {
//        PosterItem[] tmp = new PosterItem[items.length];
//        for (int i = 0; i < items.length; i++) {
//            tmp[i] = items[i];
//        }
//
//        return tmp;
//    }

    public PosterItem[] findLast(PosterItem[] items, int count) {
        PosterItem[] tmp = new PosterItem[count];
        for (int i = 0; i < count; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
//
        return tmp;


    }

}
