package com.building.gr151l5st9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import eu.printingin3d.javascad.coords.Angles3d;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.coords.Triangle3d;
import eu.printingin3d.javascad.enums.Side;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

public class Building extends Union {
	private static final double WIDTH = 40.0;
	private static final double HEIGHT = 40;
	private static final double KNOB_DIAMETER = 4;
	
	public Building() {
		super(getModels());
	}



	private static List<Abstract3dModel> getModels() {
		List<Abstract3dModel> models = new ArrayList();
		//Главный зал
		Difference generalBuilding = new Difference(
						new Cube(new Dims3d(WIDTH*3, WIDTH*0.5, HEIGHT*1.5)).move(Coords3d.yOnly(-8)).move(Coords3d.zOnly(-10)),
						new Cube(new Dims3d(WIDTH*1.6, WIDTH/2, HEIGHT/2)).move(Coords3d.yOnly(-4)).move(Coords3d.zOnly(8)),
						new Sphere(35)
				);
		//Боковые постройки от главного входа
		Difference sideBuildings = new Difference(
				new Cube(new Dims3d(WIDTH*2, WIDTH*0.6, HEIGHT)).move(Coords3d.yOnly(-8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(27)).move(Coords3d.zOnly(-8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(8)).move(Coords3d.zOnly(-8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(-27)).move(Coords3d.zOnly(-8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(-8)).move(Coords3d.zOnly(-8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(27)).move(Coords3d.zOnly(8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(8)).move(Coords3d.zOnly(8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(-27)).move(Coords3d.zOnly(8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(-8)).move(Coords3d.zOnly(8))
		);

		Difference roofSideBuildings = new Difference(
				new Cube(new Dims3d(WIDTH*2, WIDTH, HEIGHT/50)).move(Coords3d.zOnly(-20))
		);

		Difference floor = new Difference(
				new Cube(new Dims3d(WIDTH*7, WIDTH, HEIGHT/50)).move(Coords3d.zOnly(20))
		);

		Difference roofGenereal = new Difference(
				new Cube(new Dims3d(WIDTH, WIDTH/3, HEIGHT)).move(Coords3d.zOnly(-90)).rotate(Angles3d.yOnly(45)).move(Coords3d.xOnly(63)).move(Coords3d.yOnly(-10)),
				new Cube(new Dims3d(WIDTH*2, WIDTH, HEIGHT)).move(Coords3d.zOnly(2))
		);



		Difference roofGenereal2 = new Difference(
				new Cube(new Dims3d(WIDTH*3.1, WIDTH*1.5, HEIGHT/50)).move(Coords3d.zOnly(-40)).move(Coords3d.yOnly(10)),
				new Cube(new Dims3d(WIDTH*4,20,30)).move(Coords3d.zOnly(-40)).move(Coords3d.yOnly(35)),
				new Cube(new Dims3d(WIDTH*1.8,20,30)).move(Coords3d.zOnly(-40)).move(Coords3d.yOnly(17))
		);

		//Башни между боковыми постройками и главным зданием
		Difference tower = new Difference(
				new Cube(new Dims3d(WIDTH*0.3, WIDTH, HEIGHT*1.9)).move(Coords3d.zOnly(-15)).move(Coords3d.yOnly(10))
		);

		Difference onTower = new Difference(
				new Cube(new Dims3d(WIDTH*0.5, WIDTH/2, HEIGHT/2)).move(Coords3d.zOnly(-50)).move(Coords3d.yOnly(10))
		);

		Difference stair = new Difference(
				new Cube(new Dims3d(WIDTH*2, WIDTH*0.6, HEIGHT/50)).move(Coords3d.yOnly(8)).move(Coords3d.zOnly(19.5))
		);

		Difference stair2 = new Difference(
				new Cube(new Dims3d(WIDTH*2, WIDTH*0.6, HEIGHT/50)).move(Coords3d.yOnly(6)).move(Coords3d.zOnly(19))
		);

		Difference stair3 = new Difference(
				new Cube(new Dims3d(WIDTH*2, WIDTH*0.6, HEIGHT/50)).move(Coords3d.yOnly(4)).move(Coords3d.zOnly(18.5))
		);

		Difference stair4 = new Difference(
				new Cube(new Dims3d(WIDTH*2, WIDTH*0.6, HEIGHT/50)).move(Coords3d.yOnly(2)).move(Coords3d.zOnly(18))
		);

		Difference sideUp = new Difference(
				new Cube(new Dims3d(WIDTH*2, WIDTH*0.6, 3.2)).move(Coords3d.yOnly(8)).move(Coords3d.zOnly(18))
		);

		Difference colon = new Difference(
				new Cylinder(HEIGHT,KNOB_DIAMETER).move(Coords3d.yOnly(3))
		);
                Difference colon1 = new Difference(
				new Cylinder(HEIGHT,KNOB_DIAMETER).move(Coords3d.yOnly(18))
		);

		models.add(generalBuilding);
		models.add(floor);
		models.add(roofGenereal);
		models.add(roofGenereal2);
		models.add(sideUp.move(Coords3d.xOnly(100)));
		models.add(sideUp.move(Coords3d.xOnly(-100)));
		models.add(stair);
		models.add(stair2);
		models.add(stair3);
		models.add(stair4);
		models.add(colon.move(Coords3d.xOnly(100)));
		models.add(colon.move(Coords3d.xOnly(117.5)));
		models.add(colon.move(Coords3d.xOnly(82.5)));
		models.add(colon.move(Coords3d.xOnly(135)));
		models.add(colon.move(Coords3d.xOnly(65)));
		models.add(colon.move(Coords3d.xOnly(-100)));
		models.add(colon.move(Coords3d.xOnly(-117.5)));
		models.add(colon.move(Coords3d.xOnly(-82.5)));
		models.add(colon.move(Coords3d.xOnly(-135)));
		models.add(colon.move(Coords3d.xOnly(-65)));
                models.add(colon1.move(Coords3d.xOnly(100)));
		models.add(colon1.move(Coords3d.xOnly(117.5)));
		models.add(colon1.move(Coords3d.xOnly(82.5)));
		models.add(colon1.move(Coords3d.xOnly(135)));
		models.add(colon1.move(Coords3d.xOnly(65)));
		models.add(colon1.move(Coords3d.xOnly(-100)));
		models.add(colon1.move(Coords3d.xOnly(-117.5)));
		models.add(colon1.move(Coords3d.xOnly(-82.5)));
		models.add(colon1.move(Coords3d.xOnly(-135)));
		models.add(colon1.move(Coords3d.xOnly(-65)));
		models.add(roofSideBuildings.move(Coords3d.xOnly(100)));
		models.add(roofSideBuildings.move(Coords3d.xOnly(-100)));
		models.add(onTower.move(Coords3d.xOnly(50)));
		models.add(onTower.move(Coords3d.xOnly(-50)));
		models.add(tower.move(Coords3d.xOnly(50)));
		models.add(tower.move(Coords3d.xOnly(-50)));
		models.add(sideBuildings.move(Coords3d.xOnly(100)));
		models.add(sideBuildings.move(Coords3d.xOnly(-100)));
		return models;
	}

}
