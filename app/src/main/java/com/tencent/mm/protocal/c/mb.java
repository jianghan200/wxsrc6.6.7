package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class mb
  extends bhd
{
  public int amount;
  public String hUM;
  public b rpU;
  public b rpV;
  public int rpW = 4;
  
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
      paramVarArgs.fT(2, this.amount);
      if (this.rpU != null) {
        paramVarArgs.b(3, this.rpU);
      }
      if (this.rpV != null) {
        paramVarArgs.b(4, this.rpV);
      }
      if (this.hUM != null) {
        paramVarArgs.g(5, this.hUM);
      }
      paramVarArgs.fT(6, this.rpW);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label510;
      }
    }
    label510:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.amount);
      paramInt = i;
      if (this.rpU != null) {
        paramInt = i + f.a.a.a.a(3, this.rpU);
      }
      i = paramInt;
      if (this.rpV != null) {
        i = paramInt + f.a.a.a.a(4, this.rpV);
      }
      paramInt = i;
      if (this.hUM != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.hUM);
      }
      return paramInt + f.a.a.a.fQ(6, this.rpW);
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
        mb localmb = (mb)paramVarArgs[1];
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
            localmb.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localmb.amount = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localmb.rpU = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 4: 
          localmb.rpV = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 5: 
          localmb.hUM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localmb.rpW = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */