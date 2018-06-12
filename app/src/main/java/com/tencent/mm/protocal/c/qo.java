package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class qo
  extends bhp
{
  public int hLg;
  public LinkedList<atj> rbQ = new LinkedList();
  public bhz rbR;
  public bhy rcn;
  public String rqZ;
  public String rra;
  public bhz ruR;
  public bhz ruT;
  public bhz ruU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ruR == null) {
        throw new b("Not all required fields were included: Topic");
      }
      if (this.ruT == null) {
        throw new b("Not all required fields were included: PYInitial");
      }
      if (this.ruU == null) {
        throw new b("Not all required fields were included: QuanPin");
      }
      if (this.rbR == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (this.rcn == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.ruR != null)
      {
        paramVarArgs.fV(2, this.ruR.boi());
        this.ruR.a(paramVarArgs);
      }
      if (this.ruT != null)
      {
        paramVarArgs.fV(3, this.ruT.boi());
        this.ruT.a(paramVarArgs);
      }
      if (this.ruU != null)
      {
        paramVarArgs.fV(4, this.ruU.boi());
        this.ruU.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.hLg);
      paramVarArgs.d(6, 8, this.rbQ);
      if (this.rbR != null)
      {
        paramVarArgs.fV(7, this.rbR.boi());
        this.rbR.a(paramVarArgs);
      }
      if (this.rcn != null)
      {
        paramVarArgs.fV(8, this.rcn.boi());
        this.rcn.a(paramVarArgs);
      }
      if (this.rqZ != null) {
        paramVarArgs.g(9, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(10, this.rra);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1500;
      }
    }
    label1500:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ruR != null) {
        paramInt = i + f.a.a.a.fS(2, this.ruR.boi());
      }
      i = paramInt;
      if (this.ruT != null) {
        i = paramInt + f.a.a.a.fS(3, this.ruT.boi());
      }
      paramInt = i;
      if (this.ruU != null) {
        paramInt = i + f.a.a.a.fS(4, this.ruU.boi());
      }
      i = paramInt + f.a.a.a.fQ(5, this.hLg) + f.a.a.a.c(6, 8, this.rbQ);
      paramInt = i;
      if (this.rbR != null) {
        paramInt = i + f.a.a.a.fS(7, this.rbR.boi());
      }
      i = paramInt;
      if (this.rcn != null) {
        i = paramInt + f.a.a.a.fS(8, this.rcn.boi());
      }
      paramInt = i;
      if (this.rqZ != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rqZ);
      }
      i = paramInt;
      if (this.rra != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rra);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rbQ.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.ruR == null) {
          throw new b("Not all required fields were included: Topic");
        }
        if (this.ruT == null) {
          throw new b("Not all required fields were included: PYInitial");
        }
        if (this.ruU == null) {
          throw new b("Not all required fields were included: QuanPin");
        }
        if (this.rbR == null) {
          throw new b("Not all required fields were included: ChatRoomName");
        }
        if (this.rcn != null) {
          break;
        }
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        qo localqo = (qo)paramVarArgs[1];
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
            localqo.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localqo.ruR = ((bhz)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localqo.ruT = ((bhz)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localqo.ruU = ((bhz)localObject1);
            paramInt += 1;
          }
        case 5: 
          localqo.hLg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new atj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localqo.rbQ.add(localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localqo.rbR = ((bhz)localObject1);
            paramInt += 1;
          }
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localqo.rcn = ((bhy)localObject1);
            paramInt += 1;
          }
        case 9: 
          localqo.rqZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localqo.rra = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/qo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */