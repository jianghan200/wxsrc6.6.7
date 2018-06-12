package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class iz
  extends com.tencent.mm.bk.a
{
  public int rkm;
  public int rkn;
  public int rko;
  public LinkedList<iy> rkp = new LinkedList();
  public LinkedList<iy> rkq = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rkm);
      paramVarArgs.fT(2, this.rkn);
      paramVarArgs.fT(5, this.rko);
      paramVarArgs.d(3, 8, this.rkp);
      paramVarArgs.d(4, 8, this.rkq);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rkm) + 0 + f.a.a.a.fQ(2, this.rkn) + f.a.a.a.fQ(5, this.rko) + f.a.a.a.c(3, 8, this.rkp) + f.a.a.a.c(4, 8, this.rkq);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rkp.clear();
      this.rkq.clear();
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
      iz localiz = (iz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localiz.rkm = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localiz.rkn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localiz.rko = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localiz.rkp.add(localObject1);
          paramInt += 1;
        }
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new iy();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((iy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localiz.rkq.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/iz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */