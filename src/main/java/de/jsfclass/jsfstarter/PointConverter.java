package de.jsfclass.jsfstarter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Typed converter, as of JSF 2.3
 *
 */
@FacesConverter(value = "PointConverter")
public class PointConverter implements Converter<Point> {

	@Override
	public Point getAsObject(FacesContext context, UIComponent component, String value) {
		String[] tokens = value.split(";");
		if (tokens.length != 2) {
			throw new IllegalArgumentException();
		}
		Point point = new Point();
		point.setX(Integer.parseInt(tokens[0]));
		point.setY(Integer.parseInt(tokens[1]));
		return point;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Point point) {
		return point.getX() + ";" + point.getY();
	}
}

/*
// Untyped converter, as up to JSF 2.2

@FacesConverter(value = "PointConverter")
public class PointConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String[] tokens = value.split(";");
		if (tokens.length != 2) {
			throw new IllegalArgumentException();
		}
		Point point = new Point();
		point.setX(Integer.parseInt(tokens[0]));
		point.setY(Integer.parseInt(tokens[1]));
		return point;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Point point = (Point) value;
		return point.getX() + ";" + point.getY();
	}

}
*/