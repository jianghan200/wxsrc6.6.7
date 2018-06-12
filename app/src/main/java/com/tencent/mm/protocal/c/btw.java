package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class btw
  extends bhd
{
  public String reT;
  public String ruf;
  public amw srn;
  public int sro;
  
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
      if (this.ruf != null) {
        paramVarArgs.g(2, this.ruf);
      }
      if (this.reT != null) {
        paramVarArgs.g(3, this.reT);
      }
      if (this.srn != null)
      {
        paramVarArgs.fV(4, this.srn.boi());
        this.srn.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.sro);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label567;
      }
    }
    label567:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ruf != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ruf);
      }
      i = paramInt;
      if (this.reT != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.reT);
      }
      paramInt = i;
      if (this.srn != null) {
        paramInt = i + f.a.a.a.fS(4, this.srn.boi());
      }
      return paramInt + f.a.a.a.fQ(5, this.sro);
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
        btw localbtw = (btw)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbtw.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbtw.ruf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbtw.reT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new amw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((amw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbtw.srn = ((amw)localObject1);
            paramInt += 1;
          }
        }
        localbtw.sro = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/btw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */