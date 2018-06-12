package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class byj
  extends bhp
{
  public int rsj;
  public int shg;
  public byp shl;
  public String sur;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.shl == null) {
        throw new b("Not all required fields were included: NextPiece");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.shl != null)
      {
        paramVarArgs.fV(2, this.shl.boi());
        this.shl.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rsj);
      paramVarArgs.fT(4, this.shg);
      if (this.sur != null) {
        paramVarArgs.g(5, this.sur);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label619;
      }
    }
    label619:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.shl != null) {
        i = paramInt + f.a.a.a.fS(2, this.shl.boi());
      }
      i = i + f.a.a.a.fQ(3, this.rsj) + f.a.a.a.fQ(4, this.shg);
      paramInt = i;
      if (this.sur != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sur);
      }
      return paramInt;
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
        if (this.shl != null) {
          break;
        }
        throw new b("Not all required fields were included: NextPiece");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        byj localbyj = (byj)paramVarArgs[1];
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
            localbyj.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbyj.shl = ((byp)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbyj.rsj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbyj.shg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbyj.sur = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/byj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */