import org.geekbrains.HW36;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HW36TestAfterFour {
    HW36 hw36;

    @Before
    public void init() {
        hw36 = new HW36();
    }

    @Test
    public void afterFour1() {
        int[] arr11 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr12 = new int[]{5, 6, 7};
        Assert.assertArrayEquals(arr12, hw36.afterFour(arr11, 4));
    }

    @Test
    public void afterFour2() {
        int[] arr11 = new int[]{1, 2, 3, 5, 6, 7};
        int[] arr12 = new int[]{};
        Assert.assertArrayEquals(arr12, hw36.afterFour(arr11, 4));
    }

    @Test
    public void afterFour3() {
        int[] arr11 = new int[]{4, 3, 2, 3, 5, 6, 7};
        int[] arr12 = new int[]{3, 2, 3, 5, 6, 7};
        Assert.assertArrayEquals(arr12, hw36.afterFour(arr11, 4));
    }

    @Test
    public void afterFour4() {
        int[] arr11 = new int[]{4, 3, 2, 3, 5, 6, 7, 4};
        int[] arr12 = new int[]{};
        Assert.assertArrayEquals(arr12, hw36.afterFour(arr11, 4));
    }
}
