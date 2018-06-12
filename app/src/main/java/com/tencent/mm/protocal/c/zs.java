package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class zs
  extends bhp
{
  public ep jng;
  public int qZg;
  public int qZk;
  public String qZl;
  public bnr qZm;
  public int qZu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.qZk);
      paramVarArgs.fT(3, this.qZu);
      if (this.qZl != null) {
        paramVarArgs.g(4, this.qZl);
      }
      if (this.qZm != null)
      {
        paramVarArgs.fV(5, this.qZm.boi());
        this.qZm.a(paramVarArgs);
      }
      if (this.jng != null)
      {
        paramVarArgs.fV(6, this.jng.boi());
        this.jng.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.qZg);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label771;
      }
    }
    label771:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.qZk) + f.a.a.a.fQ(3, this.qZu);
      paramInt = i;
      if (this.qZl != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.qZl);
      }
      i = paramInt;
      if (this.qZm != null) {
        i = paramInt + f.a.a.a.fS(5, this.qZm.boi());
      }
      paramInt = i;
      if (this.jng != null) {
        paramInt = i + f.a.a.a.fS(6, this.jng.boi());
      }
      return paramInt + f.a.a.a.fQ(7, this.qZg);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        zs localzs = (zs)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localzs.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localzs.qZk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localzs.qZu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localzs.qZl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bnr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bnr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localzs.qZm = ((bnr)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ep();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ep)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localzs.jng = ((ep)localObject1);
            paramInt += 1;
          }
        }
        localzs.qZg = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */