package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cad
  extends bhd
{
  public int rth;
  public int rxG;
  public long rxH;
  public String seC;
  public int sef;
  public int soz;
  public cak suK;
  public cak suL;
  public long suO;
  public int svK;
  public int svV;
  public LinkedList<bhz> svW = new LinkedList();
  public int svX;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.suK == null) {
        throw new b("Not all required fields were included: PeerId");
      }
      if (this.suL == null) {
        throw new b("Not all required fields were included: CapInfo");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.seC != null) {
        paramVarArgs.g(2, this.seC);
      }
      paramVarArgs.fT(3, this.svV);
      paramVarArgs.d(4, 8, this.svW);
      if (this.suK != null)
      {
        paramVarArgs.fV(6, this.suK.boi());
        this.suK.a(paramVarArgs);
      }
      if (this.suL != null)
      {
        paramVarArgs.fV(7, this.suL.boi());
        this.suL.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.rth);
      paramVarArgs.fT(9, this.soz);
      paramVarArgs.fT(10, this.rxG);
      paramVarArgs.T(11, this.rxH);
      paramVarArgs.fT(12, this.svK);
      paramVarArgs.T(13, this.suO);
      paramVarArgs.fT(14, this.svX);
      paramVarArgs.fT(15, this.sef);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1178;
      }
    }
    label1178:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.seC != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.seC);
      }
      i = i + f.a.a.a.fQ(3, this.svV) + f.a.a.a.c(4, 8, this.svW);
      paramInt = i;
      if (this.suK != null) {
        paramInt = i + f.a.a.a.fS(6, this.suK.boi());
      }
      i = paramInt;
      if (this.suL != null) {
        i = paramInt + f.a.a.a.fS(7, this.suL.boi());
      }
      return i + f.a.a.a.fQ(8, this.rth) + f.a.a.a.fQ(9, this.soz) + f.a.a.a.fQ(10, this.rxG) + f.a.a.a.S(11, this.rxH) + f.a.a.a.fQ(12, this.svK) + f.a.a.a.S(13, this.suO) + f.a.a.a.fQ(14, this.svX) + f.a.a.a.fQ(15, this.sef);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.svW.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.suK == null) {
          throw new b("Not all required fields were included: PeerId");
        }
        if (this.suL != null) {
          break;
        }
        throw new b("Not all required fields were included: CapInfo");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cad localcad = (cad)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5: 
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
            localcad.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcad.seC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localcad.svV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcad.svW.add(localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cak();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cak)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcad.suK = ((cak)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cak();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cak)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcad.suL = ((cak)localObject1);
            paramInt += 1;
          }
        case 8: 
          localcad.rth = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localcad.soz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localcad.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localcad.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 12: 
          localcad.svK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localcad.suO = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 14: 
          localcad.svX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcad.sef = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */