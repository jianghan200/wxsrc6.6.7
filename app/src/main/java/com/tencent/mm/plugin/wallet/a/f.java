package com.tencent.mm.plugin.wallet.a;

import java.util.LinkedList;

public final class f
  extends com.tencent.mm.bk.a
{
  public double pdV;
  public double pdW;
  public double pdX;
  public String pdY;
  public LinkedList<q> pdZ = new LinkedList();
  public g pea;
  public int peb;
  public String pec;
  public String ped;
  public double pee;
  public double pef;
  public int peg;
  public String peh;
  public String pei;
  public a pej;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.c(1, this.pdV);
      paramVarArgs.c(2, this.pdW);
      paramVarArgs.c(3, this.pdX);
      if (this.pdY != null) {
        paramVarArgs.g(4, this.pdY);
      }
      paramVarArgs.d(5, 8, this.pdZ);
      if (this.pea != null)
      {
        paramVarArgs.fV(6, this.pea.boi());
        this.pea.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.peb);
      if (this.pec != null) {
        paramVarArgs.g(8, this.pec);
      }
      if (this.ped != null) {
        paramVarArgs.g(9, this.ped);
      }
      paramVarArgs.c(10, this.pee);
      paramVarArgs.c(11, this.pef);
      paramVarArgs.fT(12, this.peg);
      if (this.peh != null) {
        paramVarArgs.g(13, this.peh);
      }
      if (this.pei != null) {
        paramVarArgs.g(14, this.pei);
      }
      if (this.pej != null)
      {
        paramVarArgs.fV(15, this.pej.boi());
        this.pej.a(paramVarArgs);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.b.b.a.ec(1) + 8 + 0 + (f.a.a.b.b.a.ec(2) + 8) + (f.a.a.b.b.a.ec(3) + 8);
      paramInt = i;
      if (this.pdY != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.pdY);
      }
      i = paramInt + f.a.a.a.c(5, 8, this.pdZ);
      paramInt = i;
      if (this.pea != null) {
        paramInt = i + f.a.a.a.fS(6, this.pea.boi());
      }
      i = paramInt + f.a.a.a.fQ(7, this.peb);
      paramInt = i;
      if (this.pec != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.pec);
      }
      i = paramInt;
      if (this.ped != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.ped);
      }
      i = i + (f.a.a.b.b.a.ec(10) + 8) + (f.a.a.b.b.a.ec(11) + 8) + f.a.a.a.fQ(12, this.peg);
      paramInt = i;
      if (this.peh != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.peh);
      }
      i = paramInt;
      if (this.pei != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.pei);
      }
      paramInt = i;
    } while (this.pej == null);
    return i + f.a.a.a.fS(15, this.pej.boi());
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.pdZ.clear();
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
      f localf = (f)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localf.pdV = ((f.a.a.a.a)localObject1).vHC.readDouble();
        return 0;
      case 2: 
        localf.pdW = ((f.a.a.a.a)localObject1).vHC.readDouble();
        return 0;
      case 3: 
        localf.pdX = ((f.a.a.a.a)localObject1).vHC.readDouble();
        return 0;
      case 4: 
        localf.pdY = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new q();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((q)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localf.pdZ.add(localObject1);
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
          localObject1 = new g();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((g)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localf.pea = ((g)localObject1);
          paramInt += 1;
        }
        return 0;
      case 7: 
        localf.peb = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localf.pec = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 9: 
        localf.ped = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 10: 
        localf.pee = ((f.a.a.a.a)localObject1).vHC.readDouble();
        return 0;
      case 11: 
        localf.pef = ((f.a.a.a.a)localObject1).vHC.readDouble();
        return 0;
      case 12: 
        localf.peg = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 13: 
        localf.peh = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 14: 
        localf.pei = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new a();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((a)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localf.pej = ((a)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */