package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class vp
  extends bhd
{
  public String bPS;
  public long ryO;
  public String ryP;
  public String ryT;
  
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
      paramVarArgs.T(2, this.ryO);
      if (this.ryT != null) {
        paramVarArgs.g(3, this.ryT);
      }
      if (this.bPS != null) {
        paramVarArgs.g(4, this.bPS);
      }
      if (this.ryP != null) {
        paramVarArgs.g(5, this.ryP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label477;
      }
    }
    label477:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.ryO);
      paramInt = i;
      if (this.ryT != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.ryT);
      }
      i = paramInt;
      if (this.bPS != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.bPS);
      }
      paramInt = i;
      if (this.ryP != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.ryP);
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
        vp localvp = (vp)paramVarArgs[1];
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
            localvp.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localvp.ryO = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 3: 
          localvp.ryT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localvp.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localvp.ryP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/vp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */