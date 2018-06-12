package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class dq
  extends com.tencent.mm.bk.a
{
  public dr rdN;
  public ds rdT;
  public com.tencent.mm.bk.b rdU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rdT == null) {
        throw new f.a.a.b("Not all required fields were included: VoiceAttr");
      }
      if (this.rdN == null) {
        throw new f.a.a.b("Not all required fields were included: UploadCtx");
      }
      if (this.rdU == null) {
        throw new f.a.a.b("Not all required fields were included: VoiceData");
      }
      if (this.rdT != null)
      {
        paramVarArgs.fV(1, this.rdT.boi());
        this.rdT.a(paramVarArgs);
      }
      if (this.rdN != null)
      {
        paramVarArgs.fV(2, this.rdN.boi());
        this.rdN.a(paramVarArgs);
      }
      if (this.rdU != null) {
        paramVarArgs.b(3, this.rdU);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rdT == null) {
        break label574;
      }
    }
    label574:
    for (int i = f.a.a.a.fS(1, this.rdT.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rdN != null) {
        paramInt = i + f.a.a.a.fS(2, this.rdN.boi());
      }
      i = paramInt;
      if (this.rdU != null) {
        i = paramInt + f.a.a.a.a(3, this.rdU);
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
        if (this.rdT == null) {
          throw new f.a.a.b("Not all required fields were included: VoiceAttr");
        }
        if (this.rdN == null) {
          throw new f.a.a.b("Not all required fields were included: UploadCtx");
        }
        if (this.rdU != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: VoiceData");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        dq localdq = (dq)paramVarArgs[1];
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
            localObject1 = new ds();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ds)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localdq.rdT = ((ds)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new dr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((dr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localdq.rdN = ((dr)localObject1);
            paramInt += 1;
          }
        }
        localdq.rdU = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */