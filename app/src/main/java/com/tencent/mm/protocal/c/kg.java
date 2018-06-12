package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class kg
  extends com.tencent.mm.bk.a
{
  public int iwE;
  public int rlX;
  public int rlY;
  public int rlZ;
  public int rma;
  public LinkedList<bhz> rmb = new LinkedList();
  public String rmc;
  public bhy rmd;
  public int rme;
  public int rmf;
  public LinkedList<bhz> rmg = new LinkedList();
  public LinkedList<kh> rmh = new LinkedList();
  public LinkedList<kh> rmi = new LinkedList();
  public int rmj;
  public int rmk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rmd == null) {
        throw new b("Not all required fields were included: AuthKey");
      }
      paramVarArgs.fT(1, this.rlX);
      paramVarArgs.fT(2, this.iwE);
      paramVarArgs.fT(3, this.rlY);
      paramVarArgs.fT(4, this.rlZ);
      paramVarArgs.fT(5, this.rma);
      paramVarArgs.d(6, 8, this.rmb);
      if (this.rmc != null) {
        paramVarArgs.g(7, this.rmc);
      }
      if (this.rmd != null)
      {
        paramVarArgs.fV(8, this.rmd.boi());
        this.rmd.a(paramVarArgs);
      }
      paramVarArgs.fT(9, this.rme);
      paramVarArgs.fT(10, this.rmf);
      paramVarArgs.d(11, 8, this.rmg);
      paramVarArgs.d(12, 8, this.rmh);
      paramVarArgs.d(13, 8, this.rmi);
      paramVarArgs.fT(14, this.rmj);
      paramVarArgs.fT(15, this.rmk);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.rlX) + 0 + f.a.a.a.fQ(2, this.iwE) + f.a.a.a.fQ(3, this.rlY) + f.a.a.a.fQ(4, this.rlZ) + f.a.a.a.fQ(5, this.rma) + f.a.a.a.c(6, 8, this.rmb);
      paramInt = i;
      if (this.rmc != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rmc);
      }
      i = paramInt;
      if (this.rmd != null) {
        i = paramInt + f.a.a.a.fS(8, this.rmd.boi());
      }
      return i + f.a.a.a.fQ(9, this.rme) + f.a.a.a.fQ(10, this.rmf) + f.a.a.a.c(11, 8, this.rmg) + f.a.a.a.c(12, 8, this.rmh) + f.a.a.a.c(13, 8, this.rmi) + f.a.a.a.fQ(14, this.rmj) + f.a.a.a.fQ(15, this.rmk);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rmb.clear();
      this.rmg.clear();
      this.rmh.clear();
      this.rmi.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rmd == null) {
        throw new b("Not all required fields were included: AuthKey");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      kg localkg = (kg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localkg.rlX = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localkg.iwE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localkg.rlY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localkg.rlZ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localkg.rma = ((f.a.a.a.a)localObject1).vHC.rY();
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
          localkg.rmb.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 7: 
        localkg.rmc = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 8: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkg.rmd = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 9: 
        localkg.rme = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 10: 
        localkg.rmf = ((f.a.a.a.a)localObject1).vHC.rY();
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
          localkg.rmg.add(localObject1);
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
          localObject1 = new kh();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkg.rmh.add(localObject1);
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
          localObject1 = new kh();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkg.rmi.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 14: 
        localkg.rmj = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localkg.rmk = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/kg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */