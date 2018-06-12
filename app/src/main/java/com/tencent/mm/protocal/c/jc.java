package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class jc
  extends com.tencent.mm.bk.a
{
  public LinkedList<xc> rkt = new LinkedList();
  public LinkedList<xb> rku = new LinkedList();
  public String rkv;
  public String rkw;
  public String rkx;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.rkt);
      paramVarArgs.d(2, 8, this.rku);
      if (this.rkv != null) {
        paramVarArgs.g(3, this.rkv);
      }
      if (this.rkw != null) {
        paramVarArgs.g(4, this.rkw);
      }
      if (this.rkx != null) {
        paramVarArgs.g(5, this.rkx);
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
      i = f.a.a.a.c(1, 8, this.rkt) + 0 + f.a.a.a.c(2, 8, this.rku);
      paramInt = i;
      if (this.rkv != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rkv);
      }
      i = paramInt;
      if (this.rkw != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rkw);
      }
      paramInt = i;
    } while (this.rkx == null);
    return i + f.a.a.b.b.a.h(5, this.rkx);
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rkt.clear();
      this.rku.clear();
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
      jc localjc = (jc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new xc();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((xc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localjc.rkt.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new xb();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((xb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localjc.rku.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localjc.rkv = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localjc.rkw = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localjc.rkx = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/jc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */