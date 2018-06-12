package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class acq
  extends com.tencent.mm.bk.a
{
  public int qZc;
  public int rHi;
  public bhy rHj;
  public String rHk;
  public int rHl;
  public long rHm;
  public int rwr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.qZc);
      paramVarArgs.fT(2, this.rHi);
      if (this.rHj != null)
      {
        paramVarArgs.fV(3, this.rHj.boi());
        this.rHj.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.rwr);
      if (this.rHk != null) {
        paramVarArgs.g(5, this.rHk);
      }
      paramVarArgs.fT(6, this.rHl);
      paramVarArgs.T(7, this.rHm);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.qZc) + 0 + f.a.a.a.fQ(2, this.rHi);
      paramInt = i;
      if (this.rHj != null) {
        paramInt = i + f.a.a.a.fS(3, this.rHj.boi());
      }
      i = paramInt + f.a.a.a.fQ(4, this.rwr);
      paramInt = i;
      if (this.rHk != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rHk);
      }
      return paramInt + f.a.a.a.fQ(6, this.rHl) + f.a.a.a.S(7, this.rHm);
    }
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
      acq localacq = (acq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localacq.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localacq.rHi = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localacq.rHj = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        localacq.rwr = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localacq.rHk = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 6: 
        localacq.rHl = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localacq.rHm = ((f.a.a.a.a)localObject1).vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/acq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */