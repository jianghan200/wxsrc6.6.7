package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cgw
  extends com.tencent.mm.bk.a
{
  public int riv;
  public LinkedList<li> rvb = new LinkedList();
  public int sBb;
  public String sBc;
  public String sBd;
  public int sBe;
  public dg sBf;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.riv);
      paramVarArgs.fT(2, this.sBb);
      if (this.sBc != null) {
        paramVarArgs.g(3, this.sBc);
      }
      if (this.sBd != null) {
        paramVarArgs.g(4, this.sBd);
      }
      paramVarArgs.fT(5, this.sBe);
      paramVarArgs.d(6, 8, this.rvb);
      if (this.sBf != null)
      {
        paramVarArgs.fV(7, this.sBf.boi());
        this.sBf.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.riv) + 0 + f.a.a.a.fQ(2, this.sBb);
      paramInt = i;
      if (this.sBc != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.sBc);
      }
      i = paramInt;
      if (this.sBd != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.sBd);
      }
      i = i + f.a.a.a.fQ(5, this.sBe) + f.a.a.a.c(6, 8, this.rvb);
      paramInt = i;
    } while (this.sBf == null);
    return i + f.a.a.a.fS(7, this.sBf.boi());
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rvb.clear();
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
      cgw localcgw = (cgw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localcgw.riv = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localcgw.sBb = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localcgw.sBc = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localcgw.sBd = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        localcgw.sBe = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new li();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((li)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcgw.rvb.add(localObject1);
          paramInt += 1;
        }
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new dg();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((dg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localcgw.sBf = ((dg)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cgw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */