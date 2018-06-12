package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class nw
  extends bhp
{
  public int hwV;
  public String hwW;
  public alr rrT;
  public LinkedList<alq> rrU = new LinkedList();
  public String rrV;
  
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
      paramVarArgs.fT(2, this.hwV);
      if (this.hwW != null) {
        paramVarArgs.g(3, this.hwW);
      }
      if (this.rrT != null)
      {
        paramVarArgs.fV(4, this.rrT.boi());
        this.rrT.a(paramVarArgs);
      }
      paramVarArgs.d(5, 8, this.rrU);
      if (this.rrV != null) {
        paramVarArgs.g(6, this.rrV);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label736;
      }
    }
    label736:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt;
      if (this.rrT != null) {
        i = paramInt + f.a.a.a.fS(4, this.rrT.boi());
      }
      i += f.a.a.a.c(5, 8, this.rrU);
      paramInt = i;
      if (this.rrV != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rrV);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rrU.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        nw localnw = (nw)paramVarArgs[1];
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
            localnw.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localnw.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localnw.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new alr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((alr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localnw.rrT = ((alr)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new alq();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((alq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localnw.rrU.add(localObject1);
            paramInt += 1;
          }
        }
        localnw.rrV = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/nw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */