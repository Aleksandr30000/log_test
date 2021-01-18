import org.geekbrains.HW36;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HW36TestOneAndFour2 {
    HW36 hw36;

    @Before
    public void init() {
        hw36 = new HW36();
    }

    @Test
    public void oneAndFour1() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assert.assertTrue(hw36.oneAndFour2(arr, 1, 4));
    }

    @Test
    public void oneAndFour2() {
        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1};
        Assert.assertTrue(hw36.oneAndFour2(arr, 1, 4));
    }

    @Test
    public void oneAndFour3() {
        int[] arr = new int[]{4, 4, 4, 4, 4};
        Assert.assertTrue(hw36.oneAndFour2(arr, 1, 4));
    }

    @Test
    public void oneAndFour4(){
        int[] arr = new int[]{1, 1, 4, 4, 1, 4, 1};
        Assert.assertTrue(hw36.oneAndFour2(arr, 1, 4));
    }
}
