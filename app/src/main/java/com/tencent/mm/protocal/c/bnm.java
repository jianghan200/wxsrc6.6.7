package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bnm
  extends bhp
{
  public String bLe;
  public String dxK;
  public String rZK;
  public eg skj;
  public String slA;
  public String slB;
  public ei slC;
  public LinkedList<ei> slD = new LinkedList();
  public byk slE;
  public boolean slF;
  public String slG;
  public int slw;
  public ef slx;
  public String sly;
  public LinkedList<eh> slz = new LinkedList();
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.skj != null)
      {
        paramVarArgs.fV(2, this.skj.boi());
        this.skj.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.slw);
      if (this.slx != null)
      {
        paramVarArgs.fV(4, this.slx.boi());
        this.slx.a(paramVarArgs);
      }
      if (this.title != null) {
        paramVarArgs.g(5, this.title);
      }
      if (this.rZK != null) {
        paramVarArgs.g(6, this.rZK);
      }
      if (this.dxK != null) {
        paramVarArgs.g(7, this.dxK);
      }
      if (this.sly != null) {
        paramVarArgs.g(8, this.sly);
      }
      paramVarArgs.d(9, 8, this.slz);
      if (this.slA != null) {
        paramVarArgs.g(10, this.slA);
      }
      if (this.slB != null) {
        paramVarArgs.g(11, this.slB);
      }
      if (this.slC != null)
      {
        paramVarArgs.fV(12, this.slC.boi());
        this.slC.a(paramVarArgs);
      }
      paramVarArgs.d(13, 8, this.slD);
      if (this.bLe != null) {
        paramVarArgs.g(14, this.bLe);
      }
      if (this.slE != null)
      {
        paramVarArgs.fV(15, this.slE.boi());
        this.slE.a(paramVarArgs);
      }
      paramVarArgs.av(16, this.slF);
      if (this.slG != null) {
        paramVarArgs.g(17, this.slG);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1698;
      }
    }
    label1698:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.skj != null) {
        i = paramInt + f.a.a.a.fS(2, this.skj.boi());
      }
      i += f.a.a.a.fQ(3, this.slw);
      paramInt = i;
      if (this.slx != null) {
        paramInt = i + f.a.a.a.fS(4, this.slx.boi());
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.title);
      }
      paramInt = i;
      if (this.rZK != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rZK);
      }
      i = paramInt;
      if (this.dxK != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.dxK);
      }
      paramInt = i;
      if (this.sly != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.sly);
      }
      i = paramInt + f.a.a.a.c(9, 8, this.slz);
      paramInt = i;
      if (this.slA != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.slA);
      }
      i = paramInt;
      if (this.slB != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.slB);
      }
      paramInt = i;
      if (this.slC != null) {
        paramInt = i + f.a.a.a.fS(12, this.slC.boi());
      }
      i = paramInt + f.a.a.a.c(13, 8, this.slD);
      paramInt = i;
      if (this.bLe != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.bLe);
      }
      i = paramInt;
      if (this.slE != null) {
        i = paramInt + f.a.a.a.fS(15, this.slE.boi());
      }
      i += f.a.a.b.b.a.ec(16) + 1;
      paramInt = i;
      if (this.slG != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.slG);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.slz.clear();
        this.slD.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bnm localbnm = (bnm)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbnm.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new eg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((eg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbnm.skj = ((eg)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbnm.slw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ef();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ef)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbnm.slx = ((ef)localObject1);
            paramInt += 1;
          }
        case 5: 
          localbnm.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbnm.rZK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbnm.dxK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbnm.sly = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new eh();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((eh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbnm.slz.add(localObject1);
            paramInt += 1;
          }
        case 10: 
          localbnm.slA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbnm.slB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ei();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ei)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbnm.slC = ((ei)localObject1);
            paramInt += 1;
          }
        case 13: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ei();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ei)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbnm.slD.add(localObject1);
            paramInt += 1;
          }
        case 14: 
          localbnm.bLe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbnm.slE = ((byk)localObject1);
            paramInt += 1;
          }
        case 16: 
          localbnm.slF = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        }
        localbnm.slG = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bnm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */