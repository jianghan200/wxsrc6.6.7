package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bjl
  extends com.tencent.mm.bk.a
{
  public String rHk;
  public aqs rUI;
  public long rll;
  public int sjq;
  public LinkedList<bxd> sjr = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rHk == null) {
        throw new b("Not all required fields were included: KeyWord");
      }
      paramVarArgs.T(1, this.rll);
      if (this.rHk != null) {
        paramVarArgs.g(2, this.rHk);
      }
      if (this.rUI != null)
      {
        paramVarArgs.fV(3, this.rUI.boi());
        this.rUI.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.sjq);
      paramVarArgs.d(5, 8, this.sjr);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.S(1, this.rll) + 0;
      paramInt = i;
      if (this.rHk != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rHk);
      }
      i = paramInt;
      if (this.rUI != null) {
        i = paramInt + f.a.a.a.fS(3, this.rUI.boi());
      }
      return i + f.a.a.a.fQ(4, this.sjq) + f.a.a.a.c(5, 8, this.sjr);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.sjr.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rHk == null) {
        throw new b("Not all required fields were included: KeyWord");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      bjl localbjl = (bjl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbjl.rll = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 2: 
        localbjl.rHk = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aqs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbjl.rUI = ((aqs)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        localbjl.sjq = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bxd();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bxd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localbjl.sjr.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bjl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */