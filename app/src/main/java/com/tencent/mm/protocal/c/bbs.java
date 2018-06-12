package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bbs
  extends com.tencent.mm.bk.a
{
  public int hbF;
  public int hcE;
  public String jPe;
  public String lPl;
  public int otY;
  public String rJU;
  public String rxc;
  public int sdS;
  public LinkedList<apx> sdT = new LinkedList();
  public int sdU;
  public String sdV;
  public String sdW;
  public int sdX;
  public String sdY;
  public int sdZ;
  public LinkedList<sg> sea = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.sdS);
      paramVarArgs.d(2, 8, this.sdT);
      paramVarArgs.fT(3, this.hbF);
      paramVarArgs.fT(4, this.sdU);
      if (this.rxc != null) {
        paramVarArgs.g(5, this.rxc);
      }
      if (this.rJU != null) {
        paramVarArgs.g(6, this.rJU);
      }
      if (this.sdV != null) {
        paramVarArgs.g(7, this.sdV);
      }
      if (this.sdW != null) {
        paramVarArgs.g(8, this.sdW);
      }
      paramVarArgs.fT(9, this.hcE);
      if (this.jPe != null) {
        paramVarArgs.g(10, this.jPe);
      }
      if (this.lPl != null) {
        paramVarArgs.g(11, this.lPl);
      }
      paramVarArgs.fT(12, this.sdX);
      paramVarArgs.fT(13, this.otY);
      if (this.sdY != null) {
        paramVarArgs.g(14, this.sdY);
      }
      paramVarArgs.fT(15, this.sdZ);
      paramVarArgs.d(16, 8, this.sea);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.sdS) + 0 + f.a.a.a.c(2, 8, this.sdT) + f.a.a.a.fQ(3, this.hbF) + f.a.a.a.fQ(4, this.sdU);
      paramInt = i;
      if (this.rxc != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rxc);
      }
      i = paramInt;
      if (this.rJU != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rJU);
      }
      paramInt = i;
      if (this.sdV != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sdV);
      }
      i = paramInt;
      if (this.sdW != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.sdW);
      }
      i += f.a.a.a.fQ(9, this.hcE);
      paramInt = i;
      if (this.jPe != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.jPe);
      }
      i = paramInt;
      if (this.lPl != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.lPl);
      }
      i = i + f.a.a.a.fQ(12, this.sdX) + f.a.a.a.fQ(13, this.otY);
      paramInt = i;
      if (this.sdY != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.sdY);
      }
      return paramInt + f.a.a.a.fQ(15, this.sdZ) + f.a.a.a.c(16, 8, this.sea);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.sdT.clear();
      this.sea.clear();
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
      bbs localbbs = (bbs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbbs.sdS = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apx();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbbs.sdT.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localbbs.hbF = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localbbs.sdU = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localbbs.rxc = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 6: 
        localbbs.rJU = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        localbbs.sdV = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 8: 
        localbbs.sdW = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 9: 
        localbbs.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 10: 
        localbbs.jPe = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 11: 
        localbbs.lPl = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 12: 
        localbbs.sdX = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 13: 
        localbbs.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 14: 
        localbbs.sdY = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 15: 
        localbbs.sdZ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new sg();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((sg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localbbs.sea.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */