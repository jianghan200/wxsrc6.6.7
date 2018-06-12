package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ey
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public int rci;
  public bhz rcj;
  public bhz rck;
  public bhz rcl;
  public String rco;
  public long rcq;
  public String rdo;
  public int rfA;
  public int rfB;
  public long rfC;
  public int rfD;
  public int rft;
  public int rfu;
  public int rfv;
  public LinkedList<bhz> rfw = new LinkedList();
  public LinkedList<bia> rfx = new LinkedList();
  public bhy rfy;
  public int rfz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rcj == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.rcl == null) {
        throw new b("Not all required fields were included: Content");
      }
      paramVarArgs.fT(1, this.hcE);
      if (this.rdo != null) {
        paramVarArgs.g(2, this.rdo);
      }
      if (this.rcj != null)
      {
        paramVarArgs.fV(3, this.rcj.boi());
        this.rcj.a(paramVarArgs);
      }
      if (this.rck != null)
      {
        paramVarArgs.fV(4, this.rck.boi());
        this.rck.a(paramVarArgs);
      }
      if (this.rcl != null)
      {
        paramVarArgs.fV(5, this.rcl.boi());
        this.rcl.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.rft);
      paramVarArgs.fT(7, this.rfu);
      if (this.rco != null) {
        paramVarArgs.g(8, this.rco);
      }
      paramVarArgs.fT(9, this.rci);
      paramVarArgs.fT(10, this.rfv);
      paramVarArgs.d(11, 8, this.rfw);
      paramVarArgs.d(12, 8, this.rfx);
      if (this.rfy != null)
      {
        paramVarArgs.fV(13, this.rfy.boi());
        this.rfy.a(paramVarArgs);
      }
      paramVarArgs.fT(14, this.rfz);
      paramVarArgs.fT(15, this.rfA);
      paramVarArgs.T(16, this.rcq);
      paramVarArgs.fT(17, this.rfB);
      paramVarArgs.T(18, this.rfC);
      paramVarArgs.fT(19, this.rfD);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.hcE) + 0;
      paramInt = i;
      if (this.rdo != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rdo);
      }
      i = paramInt;
      if (this.rcj != null) {
        i = paramInt + f.a.a.a.fS(3, this.rcj.boi());
      }
      paramInt = i;
      if (this.rck != null) {
        paramInt = i + f.a.a.a.fS(4, this.rck.boi());
      }
      i = paramInt;
      if (this.rcl != null) {
        i = paramInt + f.a.a.a.fS(5, this.rcl.boi());
      }
      i = i + f.a.a.a.fQ(6, this.rft) + f.a.a.a.fQ(7, this.rfu);
      paramInt = i;
      if (this.rco != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rco);
      }
      i = paramInt + f.a.a.a.fQ(9, this.rci) + f.a.a.a.fQ(10, this.rfv) + f.a.a.a.c(11, 8, this.rfw) + f.a.a.a.c(12, 8, this.rfx);
      paramInt = i;
      if (this.rfy != null) {
        paramInt = i + f.a.a.a.fS(13, this.rfy.boi());
      }
      return paramInt + f.a.a.a.fQ(14, this.rfz) + f.a.a.a.fQ(15, this.rfA) + f.a.a.a.S(16, this.rcq) + f.a.a.a.fQ(17, this.rfB) + f.a.a.a.S(18, this.rfC) + f.a.a.a.fQ(19, this.rfD);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rfw.clear();
      this.rfx.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rcj == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.rcl == null) {
        throw new b("Not all required fields were included: Content");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      ey localey = (ey)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localey.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localey.rdo = ((f.a.a.a.a)localObject1).vHC.readString();
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
          localey.rcj = ((bhz)localObject1);
          paramInt += 1;
        }
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
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localey.rck = ((bhz)localObject1);
          paramInt += 1;
        }
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
          localey.rcl = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        localey.rft = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        localey.rfu = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localey.rco = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 9: 
        localey.rci = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 10: 
        localey.rfv = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 11: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localey.rfw.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 12: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bia();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bia)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localey.rfx.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 13: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localey.rfy = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 14: 
        localey.rfz = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 15: 
        localey.rfA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 16: 
        localey.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 17: 
        localey.rfB = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 18: 
        localey.rfC = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      localey.rfD = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */