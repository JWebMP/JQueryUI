package za.co.mmagon.jwebswing.plugins.jqueryui.position;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.jqueryui.position.Position;
import za.co.mmagon.jwebswing.plugins.jqueryui.position.PositionLocationHorizontal;
import za.co.mmagon.jwebswing.plugins.jqueryui.position.PositionLocationVertical;

/**
 *
 * @author MMagon
 */
public class PositionTest extends BaseTestClass
{

    public PositionTest()
    {
    }

    /**
     * Test of getMyString method, of class Position.
     */
    @Test
    public void testGetMyString()
    {
        System.out.println("getMyString");
        Div d = new Div();
        d.setID("of");
        Position instance = new Position(PositionLocationHorizontal.Left, PositionLocationVertical.top, PositionLocationHorizontal.Left, PositionLocationVertical.top, d);
        System.out.println(instance.toString());
        String expResult = "{\n"
                + "  \"myX\" : \"left\",\n"
                + "  \"myY\" : \"top\",\n"
                + "  \"atX\" : \"left\",\n"
                + "  \"atY\" : \"top\",\n"
                + "  \"of\" : \"#of\"\n"
                + "}"
                + "";
        String result = instance.toString();
        super.writeValuesToFile(expResult, result);
        assertEquals(expResult, result);
    }

}
