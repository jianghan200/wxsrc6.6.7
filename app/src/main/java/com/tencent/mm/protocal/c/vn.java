package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class vn
  extends bhd
{
  public String bPS;
  public String ryI;
  public long ryO;
  public String ryP;
  public String ryQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.bPS != null) {
        paramVarArgs.g(2, this.bPS);
      }
      paramVarArgs.T(3, this.ryO);
      if (this.ryI != null) {
        paramVarArgs.g(4, this.ryI);
      }
      if (this.ryP != null) {
        paramVarArgs.g(5, this.ryP);
      }
      if (this.ryQ != null) {
        paramVarArgs.g(6, this.ryQ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label532;
      }
    }
    label532:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bPS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bPS);
      }
      i += f.a.a.a.S(3, this.ryO);
      paramInt = i;
      if (this.ryI != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.ryI);
      }
      i = paramInt;
      if (this.ryP != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.ryP);
      }
      paramInt = i;
      if (this.ryQ != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.ryQ);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        vn localvn = (vn)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localvn.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localvn.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localvn.ryO = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localvn.ryI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localvn.ryP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localvn.ryQ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/vn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */