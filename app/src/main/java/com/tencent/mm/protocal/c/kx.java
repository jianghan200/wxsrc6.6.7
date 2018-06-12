package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class kx
  extends com.tencent.mm.bk.a
{
  public String code;
  public int rmV;
  public int rmW;
  public LinkedList<lk> rmX = new LinkedList();
  public LinkedList<lk> rmY = new LinkedList();
  public LinkedList<lk> rmZ = new LinkedList();
  public LinkedList<String> rna = new LinkedList();
  public int rnb;
  public int rnc;
  public LinkedList<pr> rnd = new LinkedList();
  public long rne;
  public int rnf;
  public String rng;
  public pr rnh;
  public LinkedList<ax> rni = new LinkedList();
  public pr rnj;
  public pr rnk;
  public pr rnl;
  public se rnm;
  public String rnn;
  public pr rno;
  public String rnp;
  public pr rnq;
  public boolean rnr;
  public boolean rns;
  public int status;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.status);
      paramVarArgs.fT(2, this.rmV);
      paramVarArgs.fT(3, this.rmW);
      paramVarArgs.d(4, 8, this.rmX);
      paramVarArgs.d(5, 8, this.rmY);
      paramVarArgs.d(6, 8, this.rmZ);
      paramVarArgs.d(7, 1, this.rna);
      paramVarArgs.fT(8, this.rnb);
      if (this.code != null) {
        paramVarArgs.g(9, this.code);
      }
      paramVarArgs.fT(10, this.rnc);
      paramVarArgs.d(11, 8, this.rnd);
      paramVarArgs.T(12, this.rne);
      paramVarArgs.fT(13, this.rnf);
      if (this.rng != null) {
        paramVarArgs.g(14, this.rng);
      }
      if (this.rnh != null)
      {
        paramVarArgs.fV(15, this.rnh.boi());
        this.rnh.a(paramVarArgs);
      }
      paramVarArgs.d(16, 8, this.rni);
      if (this.rnj != null)
      {
        paramVarArgs.fV(17, this.rnj.boi());
        this.rnj.a(paramVarArgs);
      }
      if (this.rnk != null)
      {
        paramVarArgs.fV(18, this.rnk.boi());
        this.rnk.a(paramVarArgs);
      }
      if (this.rnl != null)
      {
        paramVarArgs.fV(19, this.rnl.boi());
        this.rnl.a(paramVarArgs);
      }
      if (this.rnm != null)
      {
        paramVarArgs.fV(20, this.rnm.boi());
        this.rnm.a(paramVarArgs);
      }
      if (this.rnn != null) {
        paramVarArgs.g(21, this.rnn);
      }
      if (this.rno != null)
      {
        paramVarArgs.fV(22, this.rno.boi());
        this.rno.a(paramVarArgs);
      }
      if (this.rnp != null) {
        paramVarArgs.g(23, this.rnp);
      }
      if (this.rnq != null)
      {
        paramVarArgs.fV(24, this.rnq.boi());
        this.rnq.a(paramVarArgs);
      }
      paramVarArgs.av(25, this.rnr);
      paramVarArgs.av(26, this.rns);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.status) + 0 + f.a.a.a.fQ(2, this.rmV) + f.a.a.a.fQ(3, this.rmW) + f.a.a.a.c(4, 8, this.rmX) + f.a.a.a.c(5, 8, this.rmY) + f.a.a.a.c(6, 8, this.rmZ) + f.a.a.a.c(7, 1, this.rna) + f.a.a.a.fQ(8, this.rnb);
      paramInt = i;
      if (this.code != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.code);
      }
      i = paramInt + f.a.a.a.fQ(10, this.rnc) + f.a.a.a.c(11, 8, this.rnd) + f.a.a.a.S(12, this.rne) + f.a.a.a.fQ(13, this.rnf);
      paramInt = i;
      if (this.rng != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.rng);
      }
      i = paramInt;
      if (this.rnh != null) {
        i = paramInt + f.a.a.a.fS(15, this.rnh.boi());
      }
      i += f.a.a.a.c(16, 8, this.rni);
      paramInt = i;
      if (this.rnj != null) {
        paramInt = i + f.a.a.a.fS(17, this.rnj.boi());
      }
      i = paramInt;
      if (this.rnk != null) {
        i = paramInt + f.a.a.a.fS(18, this.rnk.boi());
      }
      paramInt = i;
      if (this.rnl != null) {
        paramInt = i + f.a.a.a.fS(19, this.rnl.boi());
      }
      i = paramInt;
      if (this.rnm != null) {
        i = paramInt + f.a.a.a.fS(20, this.rnm.boi());
      }
      paramInt = i;
      if (this.rnn != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.rnn);
      }
      i = paramInt;
      if (this.rno != null) {
        i = paramInt + f.a.a.a.fS(22, this.rno.boi());
      }
      paramInt = i;
      if (this.rnp != null) {
        paramInt = i + f.a.a.b.b.a.h(23, this.rnp);
      }
      i = paramInt;
      if (this.rnq != null) {
        i = paramInt + f.a.a.a.fS(24, this.rnq.boi());
      }
      return i + (f.a.a.b.b.a.ec(25) + 1) + (f.a.a.b.b.a.ec(26) + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rmX.clear();
      this.rmY.clear();
      this.rmZ.clear();
      this.rna.clear();
      this.rnd.clear();
      this.rni.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      kx localkx = (kx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localkx.status = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localkx.rmV = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localkx.rmW = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new lk();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((lk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rmX.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new lk();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((lk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rmY.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new lk();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((lk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rmZ.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 7: 
        localkx.rna.add(((f.a.a.a.a)localObject1).vHC.readString());
        return 0;
      case 8: 
        localkx.rnb = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localkx.code = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 10: 
        localkx.rnc = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 11: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rnd.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 12: 
        localkx.rne = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 13: 
        localkx.rnf = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 14: 
        localkx.rng = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 15: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rnh = ((pr)localObject1);
          paramInt += 1;
        }
        return 0;
      case 16: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ax();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ax)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rni.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 17: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rnj = ((pr)localObject1);
          paramInt += 1;
        }
        return 0;
      case 18: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rnk = ((pr)localObject1);
          paramInt += 1;
        }
        return 0;
      case 19: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rnl = ((pr)localObject1);
          paramInt += 1;
        }
        return 0;
      case 20: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new se();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((se)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rnm = ((se)localObject1);
          paramInt += 1;
        }
        return 0;
      case 21: 
        localkx.rnn = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 22: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rno = ((pr)localObject1);
          paramInt += 1;
        }
        return 0;
      case 23: 
        localkx.rnp = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 24: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localkx.rnq = ((pr)localObject1);
          paramInt += 1;
        }
        return 0;
      case 25: 
        localkx.rnr = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      localkx.rns = ((f.a.a.a.a)localObject1).cJQ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/kx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */