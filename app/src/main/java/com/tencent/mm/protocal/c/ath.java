package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ath
  extends com.tencent.mm.bk.a
{
  public int afv;
  public String bKg;
  public int bMQ;
  public String bPS;
  public int dHg;
  public String jOS;
  public int rVG;
  public String rVZ;
  public int rWA;
  public String rWB;
  public String rWC;
  public String rWD;
  public aso rWE;
  public int rWF;
  public int rWa;
  public int rWb;
  public int rWj;
  public String rWk;
  public atb rWx;
  public int rWy;
  public LinkedList<atb> rWz = new LinkedList();
  public String token;
  public String videoPath;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rWa);
      paramVarArgs.fT(2, this.rWb);
      paramVarArgs.fT(3, this.rVG);
      if (this.rWx != null)
      {
        paramVarArgs.fV(4, this.rWx.boi());
        this.rWx.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.rWy);
      paramVarArgs.d(6, 8, this.rWz);
      paramVarArgs.fT(7, this.dHg);
      paramVarArgs.fT(8, this.rWA);
      if (this.jOS != null) {
        paramVarArgs.g(9, this.jOS);
      }
      if (this.rWB != null) {
        paramVarArgs.g(10, this.rWB);
      }
      if (this.token != null) {
        paramVarArgs.g(11, this.token);
      }
      if (this.rWk != null) {
        paramVarArgs.g(12, this.rWk);
      }
      paramVarArgs.fT(13, this.rWj);
      if (this.videoPath != null) {
        paramVarArgs.g(14, this.videoPath);
      }
      if (this.rWC != null) {
        paramVarArgs.g(15, this.rWC);
      }
      if (this.rWD != null) {
        paramVarArgs.g(16, this.rWD);
      }
      if (this.bKg != null) {
        paramVarArgs.g(17, this.bKg);
      }
      if (this.bPS != null) {
        paramVarArgs.g(18, this.bPS);
      }
      paramVarArgs.fT(19, this.afv);
      paramVarArgs.fT(20, this.bMQ);
      if (this.rVZ != null) {
        paramVarArgs.g(21, this.rVZ);
      }
      if (this.rWE != null)
      {
        paramVarArgs.fV(22, this.rWE.boi());
        this.rWE.a(paramVarArgs);
      }
      paramVarArgs.fT(23, this.rWF);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.rWa) + 0 + f.a.a.a.fQ(2, this.rWb) + f.a.a.a.fQ(3, this.rVG);
      paramInt = i;
      if (this.rWx != null) {
        paramInt = i + f.a.a.a.fS(4, this.rWx.boi());
      }
      i = paramInt + f.a.a.a.fQ(5, this.rWy) + f.a.a.a.c(6, 8, this.rWz) + f.a.a.a.fQ(7, this.dHg) + f.a.a.a.fQ(8, this.rWA);
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.jOS);
      }
      i = paramInt;
      if (this.rWB != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rWB);
      }
      paramInt = i;
      if (this.token != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.token);
      }
      i = paramInt;
      if (this.rWk != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.rWk);
      }
      i += f.a.a.a.fQ(13, this.rWj);
      paramInt = i;
      if (this.videoPath != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.videoPath);
      }
      i = paramInt;
      if (this.rWC != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.rWC);
      }
      paramInt = i;
      if (this.rWD != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.rWD);
      }
      i = paramInt;
      if (this.bKg != null) {
        i = paramInt + f.a.a.b.b.a.h(17, this.bKg);
      }
      paramInt = i;
      if (this.bPS != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.bPS);
      }
      i = paramInt + f.a.a.a.fQ(19, this.afv) + f.a.a.a.fQ(20, this.bMQ);
      paramInt = i;
      if (this.rVZ != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.rVZ);
      }
      i = paramInt;
      if (this.rWE != null) {
        i = paramInt + f.a.a.a.fS(22, this.rWE.boi());
      }
      return i + f.a.a.a.fQ(23, this.rWF);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rWz.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      ath localath = (ath)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localath.rWa = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localath.rWb = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localath.rVG = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atb();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localath.rWx = ((atb)localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        localath.rWy = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atb();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localath.rWz.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 7: 
        localath.dHg = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localath.rWA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localath.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 10: 
        localath.rWB = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 11: 
        localath.token = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 12: 
        localath.rWk = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 13: 
        localath.rWj = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 14: 
        localath.videoPath = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 15: 
        localath.rWC = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 16: 
        localath.rWD = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 17: 
        localath.bKg = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 18: 
        localath.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 19: 
        localath.afv = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 20: 
        localath.bMQ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 21: 
        localath.rVZ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 22: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aso();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aso)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localath.rWE = ((aso)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localath.rWF = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/ath.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */