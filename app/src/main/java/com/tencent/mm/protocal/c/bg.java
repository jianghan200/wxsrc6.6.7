package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bg
  extends bhd
{
  public String bssid;
  public String egF;
  public int rbC;
  public bf rbD;
  public bi rbE;
  public int rbF;
  public int rbG;
  public int rbH;
  public String rbn;
  public long rbo;
  public int rbq;
  public String rbs;
  public int rbt;
  public int scene;
  public int source;
  public String ssid;
  public int type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.egF != null) {
        paramVarArgs.g(2, this.egF);
      }
      paramVarArgs.fT(3, this.scene);
      paramVarArgs.fT(4, this.type);
      paramVarArgs.fT(5, this.rbC);
      if (this.ssid != null) {
        paramVarArgs.g(6, this.ssid);
      }
      if (this.bssid != null) {
        paramVarArgs.g(7, this.bssid);
      }
      paramVarArgs.T(8, this.rbo);
      if (this.rbD != null)
      {
        paramVarArgs.fV(9, this.rbD.boi());
        this.rbD.a(paramVarArgs);
      }
      if (this.rbE != null)
      {
        paramVarArgs.fV(10, this.rbE.boi());
        this.rbE.a(paramVarArgs);
      }
      paramVarArgs.fT(11, this.rbq);
      if (this.rbn != null) {
        paramVarArgs.g(12, this.rbn);
      }
      paramVarArgs.fT(13, this.source);
      if (this.rbs != null) {
        paramVarArgs.g(14, this.rbs);
      }
      paramVarArgs.fT(15, this.rbF);
      paramVarArgs.fT(16, this.rbG);
      paramVarArgs.fT(17, this.rbH);
      paramVarArgs.fT(18, this.rbt);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1244;
      }
    }
    label1244:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.egF != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.egF);
      }
      i = i + f.a.a.a.fQ(3, this.scene) + f.a.a.a.fQ(4, this.type) + f.a.a.a.fQ(5, this.rbC);
      paramInt = i;
      if (this.ssid != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.ssid);
      }
      i = paramInt;
      if (this.bssid != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.bssid);
      }
      i += f.a.a.a.S(8, this.rbo);
      paramInt = i;
      if (this.rbD != null) {
        paramInt = i + f.a.a.a.fS(9, this.rbD.boi());
      }
      i = paramInt;
      if (this.rbE != null) {
        i = paramInt + f.a.a.a.fS(10, this.rbE.boi());
      }
      i += f.a.a.a.fQ(11, this.rbq);
      paramInt = i;
      if (this.rbn != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.rbn);
      }
      i = paramInt + f.a.a.a.fQ(13, this.source);
      paramInt = i;
      if (this.rbs != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.rbs);
      }
      return paramInt + f.a.a.a.fQ(15, this.rbF) + f.a.a.a.fQ(16, this.rbG) + f.a.a.a.fQ(17, this.rbH) + f.a.a.a.fQ(18, this.rbt);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bg localbg = (bg)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbg.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbg.egF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbg.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbg.type = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbg.rbC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbg.ssid = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbg.bssid = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbg.rbo = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbg.rbD = ((bf)localObject1);
            paramInt += 1;
          }
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bi();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bi)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbg.rbE = ((bi)localObject1);
            paramInt += 1;
          }
        case 11: 
          localbg.rbq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbg.rbn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localbg.source = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localbg.rbs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localbg.rbF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localbg.rbG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          localbg.rbH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbg.rbt = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */