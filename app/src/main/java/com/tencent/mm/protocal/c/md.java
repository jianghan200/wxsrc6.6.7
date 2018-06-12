package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class md
  extends bhd
{
  public int amount;
  public String rcD;
  public String rcE;
  public String rqo;
  public String rqp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rcD == null) {
        throw new b("Not all required fields were included: f2f_id");
      }
      if (this.rcE == null) {
        throw new b("Not all required fields were included: trans_id");
      }
      if (this.rqp == null) {
        throw new b("Not all required fields were included: receiver_open_id");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rcD != null) {
        paramVarArgs.g(2, this.rcD);
      }
      if (this.rcE != null) {
        paramVarArgs.g(3, this.rcE);
      }
      if (this.rqo != null) {
        paramVarArgs.g(4, this.rqo);
      }
      if (this.rqp != null) {
        paramVarArgs.g(5, this.rqp);
      }
      paramVarArgs.fT(6, this.amount);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label632;
      }
    }
    label632:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rcD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rcD);
      }
      i = paramInt;
      if (this.rcE != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rcE);
      }
      paramInt = i;
      if (this.rqo != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rqo);
      }
      i = paramInt;
      if (this.rqp != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rqp);
      }
      return i + f.a.a.a.fQ(6, this.amount);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rcD == null) {
          throw new b("Not all required fields were included: f2f_id");
        }
        if (this.rcE == null) {
          throw new b("Not all required fields were included: trans_id");
        }
        if (this.rqp != null) {
          break;
        }
        throw new b("Not all required fields were included: receiver_open_id");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        md localmd = (md)paramVarArgs[1];
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
            localmd.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localmd.rcD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localmd.rcE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localmd.rqo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localmd.rqp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localmd.amount = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/md.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */