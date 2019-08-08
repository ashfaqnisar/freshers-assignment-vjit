package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.WasteData;

public class Waste {
    private WasteData wasteData;

    public Waste() {
        wasteData = new WasteData();
        WasteWeight wasteWeight = new WasteWeight();
        WasteType wasteType = new WasteType();
        WasteBrand brandType = new WasteBrand();
        wasteData.setWeight(wasteWeight.getWeight());
        wasteData.setWasteType(wasteType.getWasteTypeData());
        wasteData.setWasteBrandData(brandType.generateBrandTypeForm(wasteType.getTheTypeOfWaste()));
    }

    public WasteData getWastageData() {
        return wasteData;
    }
}