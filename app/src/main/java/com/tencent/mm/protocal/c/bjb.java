package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bjb
  extends com.tencent.mm.bk.a
{
  public int otY;
  public String rHk;
  public aqs rUI;
  public int rjC;
  public long rll;
  public String rlo;
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
      paramVarArgs.fT(3, this.rjC);
      if (this.rUI != null)
      {
        paramVarArgs.fV(4, this.rUI.boi());
        this.rUI.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.sjq);
      paramVarArgs.d(6, 8, this.sjr);
      paramVarArgs.fT(7, this.otY);
      if (this.rlo != null) {
        paramVarArgs.g(8, this.rlo);
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
      i = f.a.a.a.S(1, this.rll) + 0;
      paramInt = i;
      if (this.rHk != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rHk);
      }
      i = paramInt + f.a.a.a.fQ(3, this.rjC);
      paramInt = i;
      if (this.rUI != null) {
        paramInt = i + f.a.a.a.fS(4, this.rUI.boi());
      }
      i = paramInt + f.a.a.a.fQ(5, this.sjq) + f.a.a.a.c(6, 8, this.sjr) + f.a.a.a.fQ(7, this.otY);
      paramInt = i;
    } while (this.rlo == null);
    return i + f.a.a.b.b.a.h(8, this.rlo);
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
      bjb localbjb = (bjb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbjb.rll = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 2: 
        localbjb.rHk = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localbjb.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aqs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbjb.rUI = ((aqs)localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        localbjb.sjq = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bxd();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bxd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbjb.sjr.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 7: 
        localbjb.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localbjb.rlo = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */