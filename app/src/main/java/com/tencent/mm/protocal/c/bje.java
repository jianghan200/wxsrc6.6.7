package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bje
  extends bhp
{
  public bhy rHj;
  public long rHm;
  public String sjt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.sjt == null) {
        throw new b("Not all required fields were included: SearchResult");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.sjt != null) {
        paramVarArgs.g(2, this.sjt);
      }
      if (this.rHj != null)
      {
        paramVarArgs.fV(3, this.rHj.boi());
        this.rHj.a(paramVarArgs);
      }
      paramVarArgs.T(4, this.rHm);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label580;
      }
    }
    label580:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sjt != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sjt);
      }
      i = paramInt;
      if (this.rHj != null) {
        i = paramInt + f.a.a.a.fS(3, this.rHj.boi());
      }
      return i + f.a.a.a.S(4, this.rHm);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.sjt != null) {
          break;
        }
        throw new b("Not all required fields were included: SearchResult");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bje localbje = (bje)paramVarArgs[1];
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
            localbje.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbje.sjt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbje.rHj = ((bhy)localObject1);
            paramInt += 1;
          }
        }
        localbje.rHm = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */