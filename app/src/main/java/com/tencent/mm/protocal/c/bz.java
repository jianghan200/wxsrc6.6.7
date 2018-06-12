package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bz
  extends com.tencent.mm.bk.a
{
  public int jQd;
  public int lOH;
  public long rcq;
  public int rcr;
  public bhz rcs;
  public int rct;
  public bhz rcu;
  public int rcv;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rcs == null) {
        throw new b("Not all required fields were included: ChatRoomId");
      }
      if (this.rcu == null) {
        throw new b("Not all required fields were included: DigestContent");
      }
      if (this.rcs != null)
      {
        paramVarArgs.fV(1, this.rcs.boi());
        this.rcs.a(paramVarArgs);
      }
      paramVarArgs.T(2, this.rcq);
      paramVarArgs.fT(3, this.rcr);
      paramVarArgs.fT(4, this.lOH);
      paramVarArgs.fT(5, this.rct);
      if (this.rcu != null)
      {
        paramVarArgs.fV(6, this.rcu.boi());
        this.rcu.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.rcv);
      paramVarArgs.fT(8, this.jQd);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rcs == null) {
        break label716;
      }
    }
    label716:
    for (paramInt = f.a.a.a.fS(1, this.rcs.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.rcq) + f.a.a.a.fQ(3, this.rcr) + f.a.a.a.fQ(4, this.lOH) + f.a.a.a.fQ(5, this.rct);
      paramInt = i;
      if (this.rcu != null) {
        paramInt = i + f.a.a.a.fS(6, this.rcu.boi());
      }
      return paramInt + f.a.a.a.fQ(7, this.rcv) + f.a.a.a.fQ(8, this.jQd);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rcs == null) {
          throw new b("Not all required fields were included: ChatRoomId");
        }
        if (this.rcu != null) {
          break;
        }
        throw new b("Not all required fields were included: DigestContent");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bz localbz = (bz)paramVarArgs[1];
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
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbz.rcs = ((bhz)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbz.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 3: 
          localbz.rcr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbz.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbz.rct = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbz.rcu = ((bhz)localObject1);
            paramInt += 1;
          }
        case 7: 
          localbz.rcv = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbz.jQd = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */