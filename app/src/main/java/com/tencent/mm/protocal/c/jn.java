package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class jn
  extends bhd
{
  public ch rkA;
  public btd rkR;
  public String rkS;
  public int rld;
  public String token;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rkR == null) {
        throw new b("Not all required fields were included: tock_mess");
      }
      if (this.rkA == null) {
        throw new b("Not all required fields were included: after_placeorder_comm_req");
      }
      if (this.token == null) {
        throw new b("Not all required fields were included: token");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rkR != null)
      {
        paramVarArgs.fV(2, this.rkR.boi());
        this.rkR.a(paramVarArgs);
      }
      if (this.rkA != null)
      {
        paramVarArgs.fV(3, this.rkA.boi());
        this.rkA.a(paramVarArgs);
      }
      if (this.rkS != null) {
        paramVarArgs.g(4, this.rkS);
      }
      paramVarArgs.fT(5, this.rld);
      if (this.token != null) {
        paramVarArgs.g(6, this.token);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label820;
      }
    }
    label820:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rkR != null) {
        paramInt = i + f.a.a.a.fS(2, this.rkR.boi());
      }
      i = paramInt;
      if (this.rkA != null) {
        i = paramInt + f.a.a.a.fS(3, this.rkA.boi());
      }
      paramInt = i;
      if (this.rkS != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rkS);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rld);
      paramInt = i;
      if (this.token != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.token);
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
        if (this.rkR == null) {
          throw new b("Not all required fields were included: tock_mess");
        }
        if (this.rkA == null) {
          throw new b("Not all required fields were included: after_placeorder_comm_req");
        }
        if (this.token != null) {
          break;
        }
        throw new b("Not all required fields were included: token");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        jn localjn = (jn)paramVarArgs[1];
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
            localjn.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new btd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((btd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localjn.rkR = ((btd)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ch();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ch)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localjn.rkA = ((ch)localObject1);
            paramInt += 1;
          }
        case 4: 
          localjn.rkS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localjn.rld = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localjn.token = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/jn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */