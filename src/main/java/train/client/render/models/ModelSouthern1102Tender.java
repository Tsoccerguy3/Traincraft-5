//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:02.09.2017 - 19:22:23
// Last changed on: 02.09.2017 - 19:22:23

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelSouthern1102Tender extends ModelBase
{
	int textureX = 512;
	int textureY = 64;

	public ModelSouthern1102Tender()
	{
		southern1102tenderModel = new ModelRendererTurbo[91];
		southern1102tenderModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 135
		southern1102tenderModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 137
		southern1102tenderModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 138
		southern1102tenderModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 139
		southern1102tenderModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 140
		southern1102tenderModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 141
		southern1102tenderModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 142
		southern1102tenderModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 143
		southern1102tenderModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 145
		southern1102tenderModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 146
		southern1102tenderModel[10] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 147
		southern1102tenderModel[11] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 148
		southern1102tenderModel[12] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 150
		southern1102tenderModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 152
		southern1102tenderModel[14] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 151
		southern1102tenderModel[15] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 152
		southern1102tenderModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 154
		southern1102tenderModel[17] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 156
		southern1102tenderModel[18] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 157
		southern1102tenderModel[19] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 164
		southern1102tenderModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 164
		southern1102tenderModel[21] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 171
		southern1102tenderModel[22] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 172
		southern1102tenderModel[23] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 173
		southern1102tenderModel[24] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 174
		southern1102tenderModel[25] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 175
		southern1102tenderModel[26] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 176
		southern1102tenderModel[27] = new ModelRendererTurbo(this, 291, 27, textureX, textureY); // Box 177
		southern1102tenderModel[28] = new ModelRendererTurbo(this, 339, 27, textureX, textureY); // Box 178
		southern1102tenderModel[29] = new ModelRendererTurbo(this, 75, 35, textureX, textureY); // Box 179
		southern1102tenderModel[30] = new ModelRendererTurbo(this, 371, 35, textureX, textureY); // Box 180
		southern1102tenderModel[31] = new ModelRendererTurbo(this, 411, 35, textureX, textureY); // Box 181
		southern1102tenderModel[32] = new ModelRendererTurbo(this, 443, 35, textureX, textureY); // Box 182
		southern1102tenderModel[33] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 183
		southern1102tenderModel[34] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 173
		southern1102tenderModel[35] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 175
		southern1102tenderModel[36] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 180
		southern1102tenderModel[37] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 181
		southern1102tenderModel[38] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 182
		southern1102tenderModel[39] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 183
		southern1102tenderModel[40] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 184
		southern1102tenderModel[41] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 185
		southern1102tenderModel[42] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 180
		southern1102tenderModel[43] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 366
		southern1102tenderModel[44] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 374
		southern1102tenderModel[45] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 375
		southern1102tenderModel[46] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 376
		southern1102tenderModel[47] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 377
		southern1102tenderModel[48] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 378
		southern1102tenderModel[49] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 388
		southern1102tenderModel[50] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 389
		southern1102tenderModel[51] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 393
		southern1102tenderModel[52] = new ModelRendererTurbo(this, 56, 43, textureX, textureY); // Box 66
		southern1102tenderModel[53] = new ModelRendererTurbo(this, 56, 43, textureX, textureY); // Box 67
		southern1102tenderModel[54] = new ModelRendererTurbo(this, 56, 43, textureX, textureY); // Box 68
		southern1102tenderModel[55] = new ModelRendererTurbo(this, 56, 43, textureX, textureY); // Box 69
		southern1102tenderModel[56] = new ModelRendererTurbo(this, 56, 43, textureX, textureY); // Box 70
		southern1102tenderModel[57] = new ModelRendererTurbo(this, 56, 43, textureX, textureY); // Box 71
		southern1102tenderModel[58] = new ModelRendererTurbo(this, 56, 43, textureX, textureY); // Box 72
		southern1102tenderModel[59] = new ModelRendererTurbo(this, 56, 43, textureX, textureY); // Box 73
		southern1102tenderModel[60] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 74
		southern1102tenderModel[61] = new ModelRendererTurbo(this, 2, 43, textureX, textureY); // Box 75
		southern1102tenderModel[62] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 77
		southern1102tenderModel[63] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 78
		southern1102tenderModel[64] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 79
		southern1102tenderModel[65] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 80
		southern1102tenderModel[66] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 81
		southern1102tenderModel[67] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 89
		southern1102tenderModel[68] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 90
		southern1102tenderModel[69] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 91
		southern1102tenderModel[70] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 92
		southern1102tenderModel[71] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 93
		southern1102tenderModel[72] = new ModelRendererTurbo(this, 210, 29, textureX, textureY); // Box 101
		southern1102tenderModel[73] = new ModelRendererTurbo(this, 318, 25, textureX, textureY, "lamp"); // Box 356
		southern1102tenderModel[74] = new ModelRendererTurbo(this, 319, 21, textureX, textureY); // Box 357
		southern1102tenderModel[75] = new ModelRendererTurbo(this, 319, 21, textureX, textureY); // Box 359
		southern1102tenderModel[76] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 361
		southern1102tenderModel[77] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 362
		southern1102tenderModel[78] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 363
		southern1102tenderModel[79] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 364
		southern1102tenderModel[80] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 367
		southern1102tenderModel[81] = new ModelRendererTurbo(this, 320, 21, textureX, textureY); // Box 360
		southern1102tenderModel[82] = new ModelRendererTurbo(this, 332, 27, textureX, textureY); // Box 396
		southern1102tenderModel[83] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 103
		southern1102tenderModel[84] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 114
		southern1102tenderModel[85] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 115
		southern1102tenderModel[86] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 116
		southern1102tenderModel[87] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 117
		southern1102tenderModel[88] = new ModelRendererTurbo(this, 1, 9, textureX, textureY, "lamp"); // Box 118
		southern1102tenderModel[89] = new ModelRendererTurbo(this, 1, 9, textureX, textureY, "lamp"); // Box 119
		southern1102tenderModel[90] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 120

		southern1102tenderModel[0].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 135
		southern1102tenderModel[0].setRotationPoint(-19.5F, 4F, -5F);

		southern1102tenderModel[1].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 137
		southern1102tenderModel[1].setRotationPoint(-10.5F, 4F, -5F);

		southern1102tenderModel[2].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 138
		southern1102tenderModel[2].setRotationPoint(2.5F, 4F, -5F);

		southern1102tenderModel[3].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 139
		southern1102tenderModel[3].setRotationPoint(11.5F, 4F, -5F);

		southern1102tenderModel[4].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 140
		southern1102tenderModel[4].setRotationPoint(11.5F, 4F, 5F);

		southern1102tenderModel[5].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 141
		southern1102tenderModel[5].setRotationPoint(2.5F, 4F, 5F);

		southern1102tenderModel[6].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 142
		southern1102tenderModel[6].setRotationPoint(-10.5F, 4F, 5F);

		southern1102tenderModel[7].addBox(1F, 0F, 0F, 6, 6, 0, 0F); // Box 143
		southern1102tenderModel[7].setRotationPoint(-19.5F, 4F, 5F);

		southern1102tenderModel[8].addShapeBox(0F, 0F, 0F, 45, 1, 20, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		southern1102tenderModel[8].setRotationPoint(-23F, 3F, -10F);

		southern1102tenderModel[9].addShapeBox(0F, 0F, 0F, 41, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		southern1102tenderModel[9].setRotationPoint(-20F, -12F, -10F);

		southern1102tenderModel[10].addShapeBox(0F, 0F, 0F, 41, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		southern1102tenderModel[10].setRotationPoint(-20F, -12F, 9F);

		southern1102tenderModel[11].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		southern1102tenderModel[11].setRotationPoint(-17F, -15F, 9F);

		southern1102tenderModel[12].addBox(0F, 0F, 0F, 29, 3, 1, 0F); // Box 150
		southern1102tenderModel[12].setRotationPoint(-17F, -15F, -10F);

		southern1102tenderModel[13].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 152
		southern1102tenderModel[13].setRotationPoint(20F, -12F, -9F);

		southern1102tenderModel[14].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 151
		southern1102tenderModel[14].setRotationPoint(-19F, -12F, -9F);

		southern1102tenderModel[15].addBox(0F, 0F, 0F, 8, 1, 18, 0F); // Box 152
		southern1102tenderModel[15].setRotationPoint(12F, -11.4F, -9F);

		southern1102tenderModel[16].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		southern1102tenderModel[16].setRotationPoint(12F, -15F, -10F);

		southern1102tenderModel[17].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 156
		southern1102tenderModel[17].setRotationPoint(11F, -15F, -9F);

		southern1102tenderModel[18].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 157
		southern1102tenderModel[18].setRotationPoint(-18F, -13F, -9F);

		southern1102tenderModel[19].addBox(0F, 0F, 0F, 28, 1, 18, 0F); // Box 164
		southern1102tenderModel[19].setRotationPoint(-17F, -12.4F, -9F);

		southern1102tenderModel[20].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 164
		southern1102tenderModel[20].setRotationPoint(20F, 4F, -1F);

		southern1102tenderModel[21].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Box 171
		southern1102tenderModel[21].setRotationPoint(-14.5F, 5.5F, -6F);

		southern1102tenderModel[22].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Box 172
		southern1102tenderModel[22].setRotationPoint(-14.5F, 7.5F, -6F);

		southern1102tenderModel[23].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 173
		southern1102tenderModel[23].setRotationPoint(-8.5F, 6.5F, -6F);

		southern1102tenderModel[24].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 174
		southern1102tenderModel[24].setRotationPoint(-15.5F, 6.5F, -6F);

		southern1102tenderModel[25].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 175
		southern1102tenderModel[25].setRotationPoint(-12.5F, 6.5F, -6F);

		southern1102tenderModel[26].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 176
		southern1102tenderModel[26].setRotationPoint(-10.5F, 6.5F, -6F);

		southern1102tenderModel[27].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Box 177
		southern1102tenderModel[27].setRotationPoint(7.5F, 5.5F, -6F);

		southern1102tenderModel[28].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Box 178
		southern1102tenderModel[28].setRotationPoint(7.5F, 7.5F, -6F);

		southern1102tenderModel[29].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 179
		southern1102tenderModel[29].setRotationPoint(6.5F, 6.5F, -6F);

		southern1102tenderModel[30].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 180
		southern1102tenderModel[30].setRotationPoint(13.5F, 6.5F, -6F);

		southern1102tenderModel[31].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 181
		southern1102tenderModel[31].setRotationPoint(9.5F, 6.5F, -6F);

		southern1102tenderModel[32].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 182
		southern1102tenderModel[32].setRotationPoint(11.5F, 6.5F, -6F);

		southern1102tenderModel[33].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 183
		southern1102tenderModel[33].setRotationPoint(20F, 4F, -10F);

		southern1102tenderModel[34].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 173
		southern1102tenderModel[34].setRotationPoint(20F, 4F, 2F);

		southern1102tenderModel[35].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 175
		southern1102tenderModel[35].setRotationPoint(20F, 8F, 2F);

		southern1102tenderModel[36].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 180
		southern1102tenderModel[36].setRotationPoint(21F, 4F, -10F);

		southern1102tenderModel[37].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 181
		southern1102tenderModel[37].setRotationPoint(21F, 4F, 9F);

		southern1102tenderModel[38].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 182
		southern1102tenderModel[38].setRotationPoint(-22F, 4F, -10F);

		southern1102tenderModel[39].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 183
		southern1102tenderModel[39].setRotationPoint(-23F, 4F, 9F);

		southern1102tenderModel[40].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 184
		southern1102tenderModel[40].setRotationPoint(-23F, 8F, -10F);

		southern1102tenderModel[41].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 185
		southern1102tenderModel[41].setRotationPoint(-23F, 4F, -10F);

		southern1102tenderModel[42].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 180
		southern1102tenderModel[42].setRotationPoint(20F, 8F, -10F);

		southern1102tenderModel[43].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 366
		southern1102tenderModel[43].setRotationPoint(9.5F, 3.5F, -2F);

		southern1102tenderModel[44].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 374
		southern1102tenderModel[44].setRotationPoint(-12.5F, 3.5F, -2F);

		southern1102tenderModel[45].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 375
		southern1102tenderModel[45].setRotationPoint(-18.5F, -11.5F, 9.5F);

		southern1102tenderModel[46].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376
		southern1102tenderModel[46].setRotationPoint(18.5F, -11.5F, 9.5F);

		southern1102tenderModel[47].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 377
		southern1102tenderModel[47].setRotationPoint(-18.5F, -11.5F, -10.5F);

		southern1102tenderModel[48].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 378
		southern1102tenderModel[48].setRotationPoint(18.5F, -11.5F, -10.5F);

		southern1102tenderModel[49].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 388
		southern1102tenderModel[49].setRotationPoint(20.5F, -11.5F, -8F);

		southern1102tenderModel[50].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 389
		southern1102tenderModel[50].setRotationPoint(20.5F, -11.5F, 6.5F);

		southern1102tenderModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		southern1102tenderModel[51].setRotationPoint(12F, -15F, 9F);

		southern1102tenderModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		southern1102tenderModel[52].setRotationPoint(-15.5F, 5.5F, -6F);

		southern1102tenderModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		southern1102tenderModel[53].setRotationPoint(-7.5F, 5.5F, -6F);

		southern1102tenderModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 68
		southern1102tenderModel[54].setRotationPoint(-7.5F, 7.5F, -6F);

		southern1102tenderModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 69
		southern1102tenderModel[55].setRotationPoint(-15.5F, 7.5F, -6F);

		southern1102tenderModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		southern1102tenderModel[56].setRotationPoint(6.5F, 5.5F, -6F);

		southern1102tenderModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		southern1102tenderModel[57].setRotationPoint(14.5F, 5.5F, -6F);

		southern1102tenderModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 72
		southern1102tenderModel[58].setRotationPoint(6.5F, 7.5F, -6F);

		southern1102tenderModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 73
		southern1102tenderModel[59].setRotationPoint(14.5F, 7.5F, -6F);

		southern1102tenderModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 74
		southern1102tenderModel[60].setRotationPoint(19F, 4F, -1F);

		southern1102tenderModel[61].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 75
		southern1102tenderModel[61].setRotationPoint(15F, -11.8F, -4F);

		southern1102tenderModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 77
		southern1102tenderModel[62].setRotationPoint(-21F, 4F, -10.5F);

		southern1102tenderModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		southern1102tenderModel[63].setRotationPoint(-18.5F, 4F, -10.5F);

		southern1102tenderModel[64].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 79
		southern1102tenderModel[64].setRotationPoint(-20.5F, 7F, -10.4F);

		southern1102tenderModel[65].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 80
		southern1102tenderModel[65].setRotationPoint(-20.5F, 6F, -10.3F);

		southern1102tenderModel[66].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 81
		southern1102tenderModel[66].setRotationPoint(-20.5F, 5F, -10.2F);

		southern1102tenderModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 89
		southern1102tenderModel[67].setRotationPoint(-18.5F, 4F, 9.5F);

		southern1102tenderModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 90
		southern1102tenderModel[68].setRotationPoint(-21F, 4F, 9.5F);

		southern1102tenderModel[69].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 91
		southern1102tenderModel[69].setRotationPoint(-20.5F, 5F, 9.2F);

		southern1102tenderModel[70].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 92
		southern1102tenderModel[70].setRotationPoint(-20.5F, 6F, 9.3F);

		southern1102tenderModel[71].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 93
		southern1102tenderModel[71].setRotationPoint(-20.5F, 7F, 9.4F);

		southern1102tenderModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		southern1102tenderModel[72].setRotationPoint(15.25F, -12.9F, 1.25F);
		southern1102tenderModel[72].rotateAngleY = -1.57079633F;

		southern1102tenderModel[73].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 356
		southern1102tenderModel[73].setRotationPoint(19.91F, -16F, -1F);

		southern1102tenderModel[74].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 357
		southern1102tenderModel[74].setRotationPoint(19.91F, -15F, -2F);

		southern1102tenderModel[75].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 359
		southern1102tenderModel[75].setRotationPoint(19.91F, -15F, 1F);

		southern1102tenderModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		southern1102tenderModel[76].setRotationPoint(19.91F, -16F, -2F);

		southern1102tenderModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		southern1102tenderModel[77].setRotationPoint(19.91F, -16F, 1F);

		southern1102tenderModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 363
		southern1102tenderModel[78].setRotationPoint(19.91F, -13F, 1F);

		southern1102tenderModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		southern1102tenderModel[79].setRotationPoint(19.91F, -13F, -2F);

		southern1102tenderModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 367
		southern1102tenderModel[80].setRotationPoint(21.91F, -12.18F, 0F);
		southern1102tenderModel[80].rotateAngleY = -3.14159265F;

		southern1102tenderModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		southern1102tenderModel[81].setRotationPoint(21.91F, -16F, -1F);

		southern1102tenderModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		southern1102tenderModel[82].setRotationPoint(18.9F, -12.7F, -1.75F);

		southern1102tenderModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 103
		southern1102tenderModel[83].setRotationPoint(21.91F, -12.18F, 1.5F);
		southern1102tenderModel[83].rotateAngleY = -3.14159265F;

		southern1102tenderModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		southern1102tenderModel[84].setRotationPoint(-20F, -15F, -10F);

		southern1102tenderModel[85].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 115
		southern1102tenderModel[85].setRotationPoint(-20F, -13F, -10F);

		southern1102tenderModel[86].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		southern1102tenderModel[86].setRotationPoint(-20F, -15F, 9F);

		southern1102tenderModel[87].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 117
		southern1102tenderModel[87].setRotationPoint(-20F, -13F, 9F);

		southern1102tenderModel[88].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 118
		southern1102tenderModel[88].setRotationPoint(21F, -13F, -8F);

		southern1102tenderModel[89].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 119
		southern1102tenderModel[89].setRotationPoint(21F, -13F, 7F);

		southern1102tenderModel[90].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 120
		southern1102tenderModel[90].setRotationPoint(-20F, -3F, -5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 91; i++)
		{
			if(southern1102tenderModel[i].boxName!= null && southern1102tenderModel[i].boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				southern1102tenderModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			} else {
				southern1102tenderModel[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo southern1102tenderModel[];
}