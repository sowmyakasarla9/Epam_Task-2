package standardproblem;


	public class StandardMaterial {

		int typeofmaterial;
		double areaofhouse;
		boolean isautomated;
		/**
		 * constructor
		 * @param typeofmaterial
		 * @param areaofhouse
		 * @param isautomated
		 */
		public StandardMaterial(int typeofmaterial,double areaofhouse,boolean isautomated)
		{
			this.typeofmaterial=typeofmaterial;
			this.areaofhouse=areaofhouse;
			this.isautomated=isautomated;		
		}
		public double FindCost()
		{
			int cost=0;
			if(typeofmaterial==0)
				cost=1200;
			else if(typeofmaterial==1)
				cost=1500;
			else if(typeofmaterial==2 && isautomated)
				cost=2500;
			else
				cost=1800;
			return areaofhouse*cost;
				
		}
	}


