package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ayv
  extends com.tencent.mm.bk.a
{
  public int hcD;
  public int hcy;
  public String jPe;
  public int jTt;
  public bhy rdp;
  public String rwQ;
  public String rwk;
  public bhy sbD;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.jTt);
      paramVarArgs.fT(2, this.hcD);
      if (this.jPe != null) {
        paramVarArgs.g(3, this.jPe);
      }
      paramVarArgs.fT(4, this.hcy);
      if (this.rdp != null)
      {
        paramVarArgs.fV(5, this.rdp.boi());
        this.rdp.a(paramVarArgs);
      }
      if (this.rwQ != null) {
        paramVarArgs.g(6, this.rwQ);
      }
      if (this.sbD != null)
      {
        paramVarArgs.fV(7, this.sbD.boi());
        this.sbD.a(paramVarArgs);
      }
      if (this.rwk != null) {
        paramVarArgs.g(8, this.rwk);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.jTt) + 0 + f.a.a.a.fQ(2, this.hcD);
      paramInt = i;
      if (this.jPe != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jPe);
      }
      i = paramInt + f.a.a.a.fQ(4, this.hcy);
      paramInt = i;
      if (this.rdp != null) {
        paramInt = i + f.a.a.a.fS(5, this.rdp.boi());
      }
      i = paramInt;
      if (this.rwQ != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rwQ);
      }
      paramInt = i;
      if (this.sbD != null) {
        paramInt = i + f.a.a.a.fS(7, this.sbD.boi());
      }
      i = paramInt;
    } while (this.rwk == null);
    return paramInt + f.a.a.b.b.a.h(8, this.rwk);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
      ayv localayv = (ayv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localayv.jTt = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localayv.hcD = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localayv.jPe = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localayv.hcy = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localayv.rdp = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        localayv.rwQ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localayv.sbD = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localayv.rwk = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ayv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */