package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class mr
  extends bhd
{
  public String bQa;
  public String myl;
  public String myq;
  public long mzF;
  public String rqG;
  public String rqo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bQa == null) {
        throw new b("Not all required fields were included: req_key");
      }
      if (this.rqG == null) {
        throw new b("Not all required fields were included: transfer_id");
      }
      if (this.myq == null) {
        throw new b("Not all required fields were included: transaction_id");
      }
      if (this.myl == null) {
        throw new b("Not all required fields were included: receiver_openid");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.bQa != null) {
        paramVarArgs.g(2, this.bQa);
      }
      if (this.rqG != null) {
        paramVarArgs.g(3, this.rqG);
      }
      if (this.myq != null) {
        paramVarArgs.g(4, this.myq);
      }
      if (this.myl != null) {
        paramVarArgs.g(5, this.myl);
      }
      paramVarArgs.T(6, this.mzF);
      if (this.rqo != null) {
        paramVarArgs.g(7, this.rqo);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label727;
      }
    }
    label727:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bQa != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bQa);
      }
      i = paramInt;
      if (this.rqG != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rqG);
      }
      paramInt = i;
      if (this.myq != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.myq);
      }
      i = paramInt;
      if (this.myl != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.myl);
      }
      i += f.a.a.a.S(6, this.mzF);
      paramInt = i;
      if (this.rqo != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rqo);
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
        if (this.bQa == null) {
          throw new b("Not all required fields were included: req_key");
        }
        if (this.rqG == null) {
          throw new b("Not all required fields were included: transfer_id");
        }
        if (this.myq == null) {
          throw new b("Not all required fields were included: transaction_id");
        }
        if (this.myl != null) {
          break;
        }
        throw new b("Not all required fields were included: receiver_openid");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        mr localmr = (mr)paramVarArgs[1];
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
            localmr.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localmr.bQa = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localmr.rqG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localmr.myq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localmr.myl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localmr.mzF = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localmr.rqo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/mr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */