

public class RayCaster
{
	
	//finding u and v
		//need viewing direction and up direction
		// u = unit vector (cross product (view direction, up direction))
		// v = unit vector (cross product (u, view direction))

	//finding aspect ratio
		//pixel width/ pixel height of output image


	//finding height and width of viewing window

		//given hfov and aspect ration --> find width with hfov and height with width and aspect ratio
		//height = tan(vfov/2)*distance*2;
		//width = tan(hfov/2)*distance*2;




	//initializing the four corners of the view window
		//need eye position, u and v, angular size(hfov, vfov), distance from eye, dimensions (hight and width) in world coordinates
		
		//n = unit vector(view direction)
		//w = width of viewing window
		//h = height of viewing window


		//ul = view origin + distance*n + h/2*v - /2*u
		//ur = view origin + distance*n + h/2*v + w/2*u
		//ll = view origin + distance*n - h/2*v - w/2*u
		//lr = view origin + distance*n - h/2*v + w/2*u




	//find step size on viewing window
		//vertical step size = ll - ul / (pixel height - 1)
		//horizontal step size = ur - yl / (pixel width - 1)


}

