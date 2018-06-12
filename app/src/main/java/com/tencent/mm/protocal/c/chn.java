package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class chn
  extends com.tencent.mm.bk.a
{
  public chq sBA;
  public chs sBB;
  public chr sBC;
  public cht sBD;
  public chm sBE;
  public chp sBy;
  public cho sBz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sBy != null)
      {
        paramVarArgs.fV(1, this.sBy.boi());
        this.sBy.a(paramVarArgs);
      }
      if (this.sBz != null)
      {
        paramVarArgs.fV(2, this.sBz.boi());
        this.sBz.a(paramVarArgs);
      }
      if (this.sBA != null)
      {
        paramVarArgs.fV(3, this.sBA.boi());
        this.sBA.a(paramVarArgs);
      }
      if (this.sBB != null)
      {
        paramVarArgs.fV(4, this.sBB.boi());
        this.sBB.a(paramVarArgs);
      }
      if (this.sBC != null)
      {
        paramVarArgs.fV(5, this.sBC.boi());
        this.sBC.a(paramVarArgs);
      }
      if (this.sBD != null)
      {
        paramVarArgs.fV(6, this.sBD.boi());
        this.sBD.a(paramVarArgs);
      }
      if (this.sBE != null)
      {
        paramVarArgs.fV(7, this.sBE.boi());
        this.sBE.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sBy == null) {
        break label1159;
      }
    }
    label1159:
    for (int i = f.a.a.a.fS(1, this.sBy.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sBz != null) {
        paramInt = i + f.a.a.a.fS(2, this.sBz.boi());
      }
      i = paramInt;
      if (this.sBA != null) {
        i = paramInt + f.a.a.a.fS(3, this.sBA.boi());
      }
      paramInt = i;
      if (this.sBB != null) {
        paramInt = i + f.a.a.a.fS(4, this.sBB.boi());
      }
      i = paramInt;
      if (this.sBC != null) {
        i = paramInt + f.a.a.a.fS(5, this.sBC.boi());
      }
      paramInt = i;
      if (this.sBD != null) {
        paramInt = i + f.a.a.a.fS(6, this.sBD.boi());
      }
      i = paramInt;
      if (this.sBE != null) {
        i = paramInt + f.a.a.a.fS(7, this.sBE.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        chn localchn = (chn)paramVarArgs[1];
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
            localObject1 = new chp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localchn.sBy = ((chp)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cho();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cho)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localchn.sBz = ((cho)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chq();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localchn.sBA = ((chq)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chs();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localchn.sBB = ((chs)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localchn.sBC = ((chr)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cht();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cht)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localchn.sBD = ((cht)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new chm();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((chm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localchn.sBE = ((chm)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/chn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */