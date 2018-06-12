package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bta
  extends com.tencent.mm.bk.a
{
  public String rsQ;
  public LinkedList<bsz> sqs = new LinkedList();
  public int sqt;
  public int squ;
  public bhl sqv;
  public int sqw;
  public LinkedList<bsy> sqx = new LinkedList();
  public int state;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rsQ == null) {
        throw new b("Not all required fields were included: patchid");
      }
      if (this.rsQ != null) {
        paramVarArgs.g(1, this.rsQ);
      }
      paramVarArgs.fT(2, this.state);
      paramVarArgs.d(3, 8, this.sqs);
      paramVarArgs.fT(4, this.sqt);
      paramVarArgs.fT(5, this.squ);
      if (this.sqv != null)
      {
        paramVarArgs.fV(6, this.sqv.boi());
        this.sqv.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.sqw);
      paramVarArgs.d(8, 8, this.sqx);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rsQ == null) {
        break label778;
      }
    }
    label778:
    for (paramInt = f.a.a.b.b.a.h(1, this.rsQ) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.state) + f.a.a.a.c(3, 8, this.sqs) + f.a.a.a.fQ(4, this.sqt) + f.a.a.a.fQ(5, this.squ);
      paramInt = i;
      if (this.sqv != null) {
        paramInt = i + f.a.a.a.fS(6, this.sqv.boi());
      }
      return paramInt + f.a.a.a.fQ(7, this.sqw) + f.a.a.a.c(8, 8, this.sqx);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sqs.clear();
        this.sqx.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rsQ != null) {
          break;
        }
        throw new b("Not all required fields were included: patchid");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bta localbta = (bta)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbta.rsQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbta.state = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bsz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bsz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbta.sqs.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localbta.sqt = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbta.squ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbta.sqv = ((bhl)localObject1);
            paramInt += 1;
          }
        case 7: 
          localbta.sqw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bsy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bsy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbta.sqx.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */