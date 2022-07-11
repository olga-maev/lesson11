import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PosterManagerTest {

    PosterItem item1 = new PosterItem(1, "Бладшот", "боевик");
    PosterItem item2 = new PosterItem(2, "Вперёд", "мульфильм");
    PosterItem item3 = new PosterItem(3, "Отель 'Белград'", "комедия");
    PosterItem item4 = new PosterItem(4, "Джентельмены", "боевик");
    PosterItem item5 = new PosterItem(5, "Человек-невидимка", "ужасы");
    PosterItem item6 = new PosterItem(6, "Тролли. Мировой тур", "мультфильм");
    PosterItem item7 = new PosterItem(7, "Влюбленные в небо", "мультфильм");
    PosterItem item8 = new PosterItem(8, "Кощей. Похитиьель невест", "мультфильм");
    PosterItem item9 = new PosterItem(9, "Школа волшебства", "приключения");
    PosterItem item10 = new PosterItem(10, "Развод. Фильм первый", "комедия");

    @Test

    public void souldAddPoster() {
        PosterManager post = new PosterManager();
        PosterItem[] expected = {item1, item2, item3};
        post.addPoster(item1);
        post.addPoster(item2);
        post.addPoster(item3);
        PosterItem[] actual = post.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void souldAddFind() {
        PosterManager post = new PosterManager();
        PosterItem[] expected = {item1, item2, item3};
        post.addPoster(item1);
        post.addPoster(item2);
        post.addPoster(item3);
        PosterItem[] actual = post.findAll(post.getItems());

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void souldAddLast1() {
        PosterManager post = new PosterManager(3);
        PosterItem[] expected = {item9, item8, item7};
        post.addPoster(item1);
        post.addPoster(item2);
        post.addPoster(item3);
        post.addPoster(item4);
        post.addPoster(item5);
        post.addPoster(item6);
        post.addPoster(item7);
        post.addPoster(item8);
        post.addPoster(item9);
        PosterItem[] actual = post.findLast(post.getItems(), post.getCount());

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void souldAddLast2() {
        PosterManager post = new PosterManager();
        PosterItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        post.addPoster(item1);
        post.addPoster(item2);
        post.addPoster(item3);
        post.addPoster(item4);
        post.addPoster(item5);
        post.addPoster(item6);
        post.addPoster(item7);
        post.addPoster(item8);
        post.addPoster(item9);
        post.addPoster(item10);
        PosterItem[] actual = post.findLast(post.getItems(), post.getCount());

        Assertions.assertArrayEquals(expected, actual);
    }

}
