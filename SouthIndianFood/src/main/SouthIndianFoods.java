package main;
import dishes.*;
import spices.*;
import ingredients.*;
import tools.*;

public class SouthIndianFoods {
	public static void main(String []args) {
		Dosa d1= new Dosa();
		Idli id= new Idli();
		Vada v1= new Vada();
		Coconut c0= new Coconut();
		Rice r1= new Rice();
		UradDal dal= new UradDal();
		Curryleaves cl= new Curryleaves();
		Mustardseeds ms= new Mustardseeds();
		TumericPowder tp= new TumericPowder();
		Mixie Mx= new Mixie();
		Tava T= new Tava();
		PressureCooker pc= new PressureCooker();
		
		d1.makeMasalaDosa();
		d1.makeOnionDosa();
		id.steamIdli() ;
		id. makeCoconutChutney();
		v1.MakeVada();
		v1.MakeSamabar();
		c0.grateCoconut();
		c0.extractCoconutMilk();
		r1.washrice();
		r1.cooksteamedRice();
		dal.soakUradDal();
		dal.grindDalBatter();
		cl.addCurryleaves();
		cl.enhanceFlavour();
		ms.temperWithMustardSeeds();
		ms.popSeedsInOil();
		tp.sprinkleTurmeric();
		tp.addColorAndFlavor();
		Mx.blendingredients();
		Mx.makespicePaste();
		T.heatTava();
		T.CookonTava();
		pc.usePressurecooker();
		pc.steamfoodinCooker();
}
}
