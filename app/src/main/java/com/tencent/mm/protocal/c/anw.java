package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class anw
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public int iwE;
  public int rQA;
  public bhz rQz;
  public String rhg;
  public String rul;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rQz == null) {
        throw new b("Not all required fields were included: NickName");
      }
      paramVarArgs.fT(1, this.iwE);
      if (this.rQz != null)
      {
        paramVarArgs.fV(2, this.rQz.boi());
        this.rQz.a(paramVarArgs);
      }
      if (this.rhg != null) {
        paramVarArgs.g(3, this.rhg);
      }
      if (this.rul != null) {
        paramVarArgs.g(4, this.rul);
      }
      if (this.hbL != null) {
        paramVarArgs.g(5, this.hbL);
      }
      paramVarArgs.fT(6, this.rQA);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.iwE) + 0;
      paramInt = i;
      if (this.rQz != null) {
        paramInt = i + f.a.a.a.fS(2, this.rQz.boi());
      }
      i = paramInt;
      if (this.rhg != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rhg);
      }
      paramInt = i;
      if (this.rul != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rul);
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hbL);
      }
      return i + f.a.a.a.fQ(6, this.rQA);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rQz == null) {
        throw new b("Not all required fields were included: NickName");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      anw localanw = (anw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localanw.iwE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localanw.rQz = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localanw.rhg = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localanw.rul = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        localanw.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localanw.rQA = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/anw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */