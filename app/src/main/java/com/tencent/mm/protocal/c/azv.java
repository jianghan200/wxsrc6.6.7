package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class azv
  extends com.tencent.mm.bk.a
{
  public String dWh;
  public String lNV;
  public String myq;
  public String rQl;
  public int scA;
  public String scB;
  public long scC;
  public LinkedList<azm> scD = new LinkedList();
  public int scw;
  public String scx;
  public int scy;
  public String scz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.scw);
      if (this.scx != null) {
        paramVarArgs.g(2, this.scx);
      }
      if (this.rQl != null) {
        paramVarArgs.g(3, this.rQl);
      }
      paramVarArgs.fT(4, this.scy);
      if (this.lNV != null) {
        paramVarArgs.g(5, this.lNV);
      }
      if (this.scz != null) {
        paramVarArgs.g(6, this.scz);
      }
      if (this.myq != null) {
        paramVarArgs.g(7, this.myq);
      }
      paramVarArgs.fT(8, this.scA);
      if (this.dWh != null) {
        paramVarArgs.g(9, this.dWh);
      }
      if (this.scB != null) {
        paramVarArgs.g(10, this.scB);
      }
      paramVarArgs.T(11, this.scC);
      paramVarArgs.d(12, 8, this.scD);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.scw) + 0;
      paramInt = i;
      if (this.scx != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.scx);
      }
      i = paramInt;
      if (this.rQl != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rQl);
      }
      i += f.a.a.a.fQ(4, this.scy);
      paramInt = i;
      if (this.lNV != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.lNV);
      }
      i = paramInt;
      if (this.scz != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.scz);
      }
      paramInt = i;
      if (this.myq != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.myq);
      }
      i = paramInt + f.a.a.a.fQ(8, this.scA);
      paramInt = i;
      if (this.dWh != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.dWh);
      }
      i = paramInt;
      if (this.scB != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.scB);
      }
      return i + f.a.a.a.S(11, this.scC) + f.a.a.a.c(12, 8, this.scD);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.scD.clear();
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
      azv localazv = (azv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localazv.scw = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localazv.scx = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localazv.rQl = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localazv.scy = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localazv.lNV = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 6: 
        localazv.scz = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        localazv.myq = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 8: 
        localazv.scA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localazv.dWh = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 10: 
        localazv.scB = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 11: 
        localazv.scC = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azm();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localazv.scD.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/azv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */