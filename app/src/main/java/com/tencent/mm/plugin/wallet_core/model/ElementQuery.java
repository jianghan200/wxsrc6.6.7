package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class ElementQuery
  implements Parcelable
{
  public static final Parcelable.Creator<ElementQuery> CREATOR = new ElementQuery.1();
  public static String pnk = "bind_serial";
  public JSONObject dKT;
  public String knE;
  public String lMV;
  public String lMW;
  public int pjA;
  public String plq;
  public boolean pnA;
  public boolean pnB;
  public boolean pnC;
  public boolean pnD;
  public boolean pnE;
  public boolean pnF;
  public boolean pnG;
  public boolean pnH;
  public boolean pnI;
  public String pnJ;
  private List<Integer> pnK = null;
  public boolean pnL;
  public String pnM;
  public int pnN;
  public boolean pnO = false;
  public String pnl;
  public boolean pnm;
  public boolean pnn;
  public boolean pno;
  public boolean pnp;
  public String pnq;
  public boolean pnr;
  public int pns;
  public int pnt;
  public String pnu;
  public String pnv;
  public String pnw;
  public String pnx;
  public String pny;
  public String pnz;
  
  public ElementQuery() {}
  
  public ElementQuery(Parcel paramParcel)
  {
    this.lMW = paramParcel.readString();
    this.knE = paramParcel.readString();
    this.pnl = paramParcel.readString();
    if (1 == paramParcel.readInt())
    {
      bool1 = true;
      this.pnm = bool1;
      if (1 != paramParcel.readInt()) {
        break label414;
      }
      bool1 = true;
      label65:
      this.pnn = bool1;
      if (1 != paramParcel.readInt()) {
        break label419;
      }
      bool1 = true;
      label80:
      this.pno = bool1;
      if (1 != paramParcel.readInt()) {
        break label424;
      }
      bool1 = true;
      label95:
      this.pnp = bool1;
      this.pnq = paramParcel.readString();
      this.lMW = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label429;
      }
      bool1 = true;
      label126:
      this.pnr = bool1;
      this.pns = paramParcel.readInt();
      this.pnt = paramParcel.readInt();
      this.lMV = paramParcel.readString();
      this.pnu = paramParcel.readString();
      this.pnv = paramParcel.readString();
      this.pnw = paramParcel.readString();
      this.pnz = paramParcel.readString();
      this.pny = paramParcel.readString();
      this.pnx = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label434;
      }
      bool1 = true;
      label213:
      this.pnA = bool1;
      if (1 != paramParcel.readInt()) {
        break label439;
      }
      bool1 = true;
      label228:
      this.pnB = bool1;
      if (1 != paramParcel.readInt()) {
        break label444;
      }
      bool1 = true;
      label243:
      this.pnC = bool1;
      if (1 != paramParcel.readInt()) {
        break label449;
      }
      bool1 = true;
      label258:
      this.pnD = bool1;
      if (1 != paramParcel.readInt()) {
        break label454;
      }
      bool1 = true;
      label273:
      this.pnE = bool1;
      if (1 != paramParcel.readInt()) {
        break label459;
      }
      bool1 = true;
      label288:
      this.pnF = bool1;
      if (1 != paramParcel.readInt()) {
        break label464;
      }
      bool1 = true;
      label303:
      this.pnH = bool1;
      if (1 != paramParcel.readInt()) {
        break label469;
      }
      bool1 = true;
      label318:
      this.pnG = bool1;
      if (1 != paramParcel.readInt()) {
        break label474;
      }
      bool1 = true;
      label333:
      this.pnI = bool1;
      this.pjA = paramParcel.readInt();
      this.pnJ = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label479;
      }
      bool1 = true;
      label364:
      this.pnO = bool1;
      this.plq = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label484;
      }
    }
    label414:
    label419:
    label424:
    label429:
    label434:
    label439:
    label444:
    label449:
    label454:
    label459:
    label464:
    label469:
    label474:
    label479:
    label484:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.pnL = bool1;
      this.pnM = paramParcel.readString();
      this.pnN = paramParcel.readInt();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label65;
      bool1 = false;
      break label80;
      bool1 = false;
      break label95;
      bool1 = false;
      break label126;
      bool1 = false;
      break label213;
      bool1 = false;
      break label228;
      bool1 = false;
      break label243;
      bool1 = false;
      break label258;
      bool1 = false;
      break label273;
      bool1 = false;
      break label288;
      bool1 = false;
      break label303;
      bool1 = false;
      break label318;
      bool1 = false;
      break label333;
      bool1 = false;
      break label364;
    }
  }
  
  public final boolean bOE()
  {
    return 1 == this.pnt;
  }
  
  public final List<Integer> bOF()
  {
    if (this.pnK != null) {
      return this.pnK;
    }
    if (!bi.oW(this.pnJ))
    {
      this.pnK = new ArrayList();
      String[] arrayOfString = this.pnJ.split("\\|");
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        int k = bi.getInt(arrayOfString[i], 0);
        if (k > 0) {
          this.pnK.add(Integer.valueOf(k));
        }
        i += 1;
      }
      return this.pnK;
    }
    return null;
  }
  
  public final boolean bOu()
  {
    return 2 == this.pnt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final boolean isError()
  {
    return "0".equals(bi.aG(this.pnv, "").trim());
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(bi.aG(this.lMW, ""));
    paramParcel.writeString(bi.aG(this.knE, ""));
    paramParcel.writeString(bi.aG(this.pnl, ""));
    if (this.pnm)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.pnn) {
        break label444;
      }
      paramInt = 1;
      label64:
      paramParcel.writeInt(paramInt);
      if (!this.pno) {
        break label449;
      }
      paramInt = 1;
      label78:
      paramParcel.writeInt(paramInt);
      if (!this.pnp) {
        break label454;
      }
      paramInt = 1;
      label92:
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(bi.aG(this.pnq, ""));
      paramParcel.writeString(bi.aG(this.lMW, ""));
      if (!this.pnr) {
        break label459;
      }
      paramInt = 1;
      label132:
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.pns);
      paramParcel.writeInt(this.pnt);
      paramParcel.writeString(bi.aG(this.lMV, ""));
      paramParcel.writeString(bi.aG(this.pnu, ""));
      paramParcel.writeString(bi.aG(this.pnv, ""));
      paramParcel.writeString(bi.aG(this.pnw, ""));
      paramParcel.writeString(bi.aG(this.pnz, ""));
      paramParcel.writeString(bi.aG(this.pny, ""));
      paramParcel.writeString(bi.aG(this.pnx, ""));
      if (!this.pnA) {
        break label464;
      }
      paramInt = 1;
      label253:
      paramParcel.writeInt(paramInt);
      if (!this.pnB) {
        break label469;
      }
      paramInt = 1;
      label267:
      paramParcel.writeInt(paramInt);
      if (!this.pnC) {
        break label474;
      }
      paramInt = 1;
      label281:
      paramParcel.writeInt(paramInt);
      if (!this.pnD) {
        break label479;
      }
      paramInt = 1;
      label295:
      paramParcel.writeInt(paramInt);
      if (!this.pnE) {
        break label484;
      }
      paramInt = 1;
      label309:
      paramParcel.writeInt(paramInt);
      if (!this.pnF) {
        break label489;
      }
      paramInt = 1;
      label323:
      paramParcel.writeInt(paramInt);
      if (!this.pnH) {
        break label494;
      }
      paramInt = 1;
      label337:
      paramParcel.writeInt(paramInt);
      if (!this.pnG) {
        break label499;
      }
      paramInt = 1;
      label351:
      paramParcel.writeInt(paramInt);
      if (!this.pnI) {
        break label504;
      }
      paramInt = 1;
      label365:
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.pjA);
      paramParcel.writeString(this.pnJ);
      if (!this.pnO) {
        break label509;
      }
      paramInt = 1;
      label395:
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.plq);
      if (!this.pnL) {
        break label514;
      }
    }
    label444:
    label449:
    label454:
    label459:
    label464:
    label469:
    label474:
    label479:
    label484:
    label489:
    label494:
    label499:
    label504:
    label509:
    label514:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.pnM);
      paramParcel.writeInt(this.pnN);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label64;
      paramInt = 0;
      break label78;
      paramInt = 0;
      break label92;
      paramInt = 0;
      break label132;
      paramInt = 0;
      break label253;
      paramInt = 0;
      break label267;
      paramInt = 0;
      break label281;
      paramInt = 0;
      break label295;
      paramInt = 0;
      break label309;
      paramInt = 0;
      break label323;
      paramInt = 0;
      break label337;
      paramInt = 0;
      break label351;
      paramInt = 0;
      break label365;
      paramInt = 0;
      break label395;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ElementQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */