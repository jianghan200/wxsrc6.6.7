package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class auy
  extends com.tencent.mm.bk.a
{
  public int eJH;
  public String eJI;
  public String eJJ;
  public String eJK;
  public int eJL;
  public String eJM;
  public int eJN;
  public int eJO;
  public String eJP;
  public String eJQ;
  public int hcd;
  public bhz rQz;
  public int rTe;
  public String rTf;
  public String rTg;
  public String rTh;
  public int rTi;
  public int rXL;
  public int rXQ;
  public com.tencent.mm.bk.b rXR;
  public int rXT;
  public bhz rXU;
  public bhz rXV;
  public int rXW;
  public int rXX;
  public int rXY;
  public int rXZ;
  public int rXf;
  public sh rXz;
  public int rYa;
  public alb rYb;
  public int rYc;
  public String rYd;
  public int raB;
  public int ray;
  public bhz rvi;
  public long ryG;
  public String ryH;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rvi == null) {
        throw new f.a.a.b("Not all required fields were included: UserName");
      }
      if (this.rQz == null) {
        throw new f.a.a.b("Not all required fields were included: NickName");
      }
      if (this.rXU == null) {
        throw new f.a.a.b("Not all required fields were included: BindEmail");
      }
      if (this.rXV == null) {
        throw new f.a.a.b("Not all required fields were included: BindMobile");
      }
      paramVarArgs.fT(1, this.rXT);
      if (this.rvi != null)
      {
        paramVarArgs.fV(2, this.rvi.boi());
        this.rvi.a(paramVarArgs);
      }
      if (this.rQz != null)
      {
        paramVarArgs.fV(3, this.rQz.boi());
        this.rQz.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.ray);
      if (this.rXU != null)
      {
        paramVarArgs.fV(5, this.rXU.boi());
        this.rXU.a(paramVarArgs);
      }
      if (this.rXV != null)
      {
        paramVarArgs.fV(6, this.rXV.boi());
        this.rXV.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.hcd);
      paramVarArgs.fT(8, this.rXQ);
      if (this.rXR != null) {
        paramVarArgs.b(9, this.rXR);
      }
      paramVarArgs.fT(10, this.eJH);
      if (this.eJI != null) {
        paramVarArgs.g(11, this.eJI);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(12, this.eJJ);
      }
      if (this.eJK != null) {
        paramVarArgs.g(13, this.eJK);
      }
      paramVarArgs.fT(14, this.eJL);
      if (this.rXz != null)
      {
        paramVarArgs.fV(15, this.rXz.boi());
        this.rXz.a(paramVarArgs);
      }
      paramVarArgs.fT(16, this.raB);
      paramVarArgs.fT(17, this.rTe);
      if (this.rTf != null) {
        paramVarArgs.g(18, this.rTf);
      }
      paramVarArgs.fT(19, this.rXW);
      paramVarArgs.fT(20, this.rXX);
      paramVarArgs.fT(21, this.rXf);
      paramVarArgs.fT(22, this.rXY);
      paramVarArgs.fT(23, this.rXZ);
      if (this.rTg != null) {
        paramVarArgs.g(24, this.rTg);
      }
      paramVarArgs.fT(25, this.rYa);
      if (this.rYb != null)
      {
        paramVarArgs.fV(26, this.rYb.boi());
        this.rYb.a(paramVarArgs);
      }
      if (this.eJM != null) {
        paramVarArgs.g(27, this.eJM);
      }
      if (this.rTh != null) {
        paramVarArgs.g(28, this.rTh);
      }
      paramVarArgs.fT(29, this.rTi);
      paramVarArgs.fT(30, this.rYc);
      paramVarArgs.T(31, this.ryG);
      if (this.ryH != null) {
        paramVarArgs.g(32, this.ryH);
      }
      paramVarArgs.fT(33, this.eJO);
      paramVarArgs.fT(34, this.eJN);
      if (this.eJP != null) {
        paramVarArgs.g(35, this.eJP);
      }
      paramVarArgs.fT(36, this.rXL);
      if (this.rYd != null) {
        paramVarArgs.g(37, this.rYd);
      }
      if (this.eJQ != null) {
        paramVarArgs.g(38, this.eJQ);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rXT) + 0;
      paramInt = i;
      if (this.rvi != null) {
        paramInt = i + f.a.a.a.fS(2, this.rvi.boi());
      }
      i = paramInt;
      if (this.rQz != null) {
        i = paramInt + f.a.a.a.fS(3, this.rQz.boi());
      }
      i += f.a.a.a.fQ(4, this.ray);
      paramInt = i;
      if (this.rXU != null) {
        paramInt = i + f.a.a.a.fS(5, this.rXU.boi());
      }
      i = paramInt;
      if (this.rXV != null) {
        i = paramInt + f.a.a.a.fS(6, this.rXV.boi());
      }
      i = i + f.a.a.a.fQ(7, this.hcd) + f.a.a.a.fQ(8, this.rXQ);
      paramInt = i;
      if (this.rXR != null) {
        paramInt = i + f.a.a.a.a(9, this.rXR);
      }
      i = paramInt + f.a.a.a.fQ(10, this.eJH);
      paramInt = i;
      if (this.eJI != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.eJI);
      }
      i = paramInt;
      if (this.eJJ != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.eJJ);
      }
      paramInt = i;
      if (this.eJK != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.eJK);
      }
      i = paramInt + f.a.a.a.fQ(14, this.eJL);
      paramInt = i;
      if (this.rXz != null) {
        paramInt = i + f.a.a.a.fS(15, this.rXz.boi());
      }
      i = paramInt + f.a.a.a.fQ(16, this.raB) + f.a.a.a.fQ(17, this.rTe);
      paramInt = i;
      if (this.rTf != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.rTf);
      }
      i = paramInt + f.a.a.a.fQ(19, this.rXW) + f.a.a.a.fQ(20, this.rXX) + f.a.a.a.fQ(21, this.rXf) + f.a.a.a.fQ(22, this.rXY) + f.a.a.a.fQ(23, this.rXZ);
      paramInt = i;
      if (this.rTg != null) {
        paramInt = i + f.a.a.b.b.a.h(24, this.rTg);
      }
      i = paramInt + f.a.a.a.fQ(25, this.rYa);
      paramInt = i;
      if (this.rYb != null) {
        paramInt = i + f.a.a.a.fS(26, this.rYb.boi());
      }
      i = paramInt;
      if (this.eJM != null) {
        i = paramInt + f.a.a.b.b.a.h(27, this.eJM);
      }
      paramInt = i;
      if (this.rTh != null) {
        paramInt = i + f.a.a.b.b.a.h(28, this.rTh);
      }
      i = paramInt + f.a.a.a.fQ(29, this.rTi) + f.a.a.a.fQ(30, this.rYc) + f.a.a.a.S(31, this.ryG);
      paramInt = i;
      if (this.ryH != null) {
        paramInt = i + f.a.a.b.b.a.h(32, this.ryH);
      }
      i = paramInt + f.a.a.a.fQ(33, this.eJO) + f.a.a.a.fQ(34, this.eJN);
      paramInt = i;
      if (this.eJP != null) {
        paramInt = i + f.a.a.b.b.a.h(35, this.eJP);
      }
      i = paramInt + f.a.a.a.fQ(36, this.rXL);
      paramInt = i;
      if (this.rYd != null) {
        paramInt = i + f.a.a.b.b.a.h(37, this.rYd);
      }
      i = paramInt;
    } while (this.eJQ == null);
    return paramInt + f.a.a.b.b.a.h(38, this.eJQ);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rvi == null) {
        throw new f.a.a.b("Not all required fields were included: UserName");
      }
      if (this.rQz == null) {
        throw new f.a.a.b("Not all required fields were included: NickName");
      }
      if (this.rXU == null) {
        throw new f.a.a.b("Not all required fields were included: BindEmail");
      }
      if (this.rXV == null) {
        throw new f.a.a.b("Not all required fields were included: BindMobile");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      auy localauy = (auy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localauy.rXT = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localauy.rvi = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localauy.rQz = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        localauy.ray = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localauy.rXU = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localauy.rXV = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 7: 
        localauy.hcd = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localauy.rXQ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localauy.rXR = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      case 10: 
        localauy.eJH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 11: 
        localauy.eJI = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 12: 
        localauy.eJJ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 13: 
        localauy.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 14: 
        localauy.eJL = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 15: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new sh();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((sh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localauy.rXz = ((sh)localObject1);
          paramInt += 1;
        }
        return 0;
      case 16: 
        localauy.raB = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 17: 
        localauy.rTe = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 18: 
        localauy.rTf = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 19: 
        localauy.rXW = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 20: 
        localauy.rXX = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 21: 
        localauy.rXf = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 22: 
        localauy.rXY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 23: 
        localauy.rXZ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 24: 
        localauy.rTg = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 25: 
        localauy.rYa = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 26: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alb();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((alb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localauy.rYb = ((alb)localObject1);
          paramInt += 1;
        }
        return 0;
      case 27: 
        localauy.eJM = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 28: 
        localauy.rTh = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 29: 
        localauy.rTi = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 30: 
        localauy.rYc = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 31: 
        localauy.ryG = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 32: 
        localauy.ryH = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 33: 
        localauy.eJO = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 34: 
        localauy.eJN = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 35: 
        localauy.eJP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 36: 
        localauy.rXL = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 37: 
        localauy.rYd = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localauy.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/auy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */