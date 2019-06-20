package factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author yebing
 */
public class ShapeFactory {
    public Shape getShapeByProperties(String shapeType) {
        Shape shape = null;
        Properties properties = new Properties();
        InputStream in = null;
        in = ShapeFactory.class.getResourceAsStream("pro.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            shape = (Shape) Class.forName(properties.getProperty(shapeType)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return shape;
    }

    public Shape getShapeByEnum(String shapeType) {
        Shape shape = null;
        try {
            shape = (Shape) Class.forName(shapeType).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return shape;
    }
}
